/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListRemediationRecipesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListRemediationRecipesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListRemediationRecipesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only resources that match the specified identifier. Required only if the
     * compartmentId query parameter is not specified.
     */
    private String id;

    /**
     * A filter to return only resources that match the specified identifier. Required only if the
     * compartmentId query parameter is not specified.
     */
    public String getId() {
        return id;
    }
    /**
     * The field used to sort Remediation Recipes. Only one sort order is allowed. Default order for
     * _displayName_ is **ascending alphabetical order**. Default order for _lifecyleState_ is the
     * following sequence: **CREATING, ACTIVE, UPDATING, INACTIVE, FAILED, DELETING, and DELETED**.
     * Default order for _timeCreated_ is **descending**. Default order for _timeUpdated_ is
     * **descending**. Default order for _type_ is the following sequence: **ADM**.
     */
    private SortBy sortBy;

    /**
     * The field used to sort Remediation Recipes. Only one sort order is allowed. Default order for
     * _displayName_ is **ascending alphabetical order**. Default order for _lifecyleState_ is the
     * following sequence: **CREATING, ACTIVE, UPDATING, INACTIVE, FAILED, DELETING, and DELETED**.
     * Default order for _timeCreated_ is **descending**. Default order for _timeUpdated_ is
     * **descending**. Default order for _type_ is the following sequence: **ADM**.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("DISPLAY_NAME"),
        LifecycleState("LIFECYCLE_STATE"),
        TimeCreated("TIME_CREATED"),
        TimeUpdated("TIME_UPDATED"),
        Type("TYPE"),
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
     * The field used to sort Remediation Recipes. Only one sort order is allowed. Default order for
     * _displayName_ is **ascending alphabetical order**. Default order for _lifecyleState_ is the
     * following sequence: **CREATING, ACTIVE, UPDATING, INACTIVE, FAILED, DELETING, and DELETED**.
     * Default order for _timeCreated_ is **descending**. Default order for _timeUpdated_ is
     * **descending**. Default order for _type_ is the following sequence: **ADM**.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only Remediation Recipes that match the specified lifecycleState. */
    private com.oracle.bmc.adm.model.RemediationRecipe.LifecycleState lifecycleState;

    /** A filter to return only Remediation Recipes that match the specified lifecycleState. */
    public com.oracle.bmc.adm.model.RemediationRecipe.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.adm.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.adm.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
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
    /**
     * A filter to return only resources that belong to the specified compartment identifier.
     * Required only if the id query param is not specified.
     */
    private String compartmentId;

    /**
     * A filter to return only resources that belong to the specified compartment identifier.
     * Required only if the id query param is not specified.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRemediationRecipesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only resources that match the specified identifier. Required only if
         * the compartmentId query parameter is not specified.
         */
        private String id = null;

        /**
         * A filter to return only resources that match the specified identifier. Required only if
         * the compartmentId query parameter is not specified.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The field used to sort Remediation Recipes. Only one sort order is allowed. Default order
         * for _displayName_ is **ascending alphabetical order**. Default order for _lifecyleState_
         * is the following sequence: **CREATING, ACTIVE, UPDATING, INACTIVE, FAILED, DELETING, and
         * DELETED**. Default order for _timeCreated_ is **descending**. Default order for
         * _timeUpdated_ is **descending**. Default order for _type_ is the following sequence:
         * **ADM**.
         */
        private SortBy sortBy = null;

        /**
         * The field used to sort Remediation Recipes. Only one sort order is allowed. Default order
         * for _displayName_ is **ascending alphabetical order**. Default order for _lifecyleState_
         * is the following sequence: **CREATING, ACTIVE, UPDATING, INACTIVE, FAILED, DELETING, and
         * DELETED**. Default order for _timeCreated_ is **descending**. Default order for
         * _timeUpdated_ is **descending**. Default order for _type_ is the following sequence:
         * **ADM**.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return only Remediation Recipes that match the specified lifecycleState. */
        private com.oracle.bmc.adm.model.RemediationRecipe.LifecycleState lifecycleState = null;

        /**
         * A filter to return only Remediation Recipes that match the specified lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.adm.model.RemediationRecipe.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /**
         * A filter to return only resources that belong to the specified compartment identifier.
         * Required only if the id query param is not specified.
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
        public Builder copy(ListRemediationRecipesRequest o) {
            id(o.getId());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRemediationRecipesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRemediationRecipesRequest
         */
        public ListRemediationRecipesRequest build() {
            ListRemediationRecipesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRemediationRecipesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRemediationRecipesRequest
         */
        public ListRemediationRecipesRequest buildWithoutInvocationCallback() {
            ListRemediationRecipesRequest request = new ListRemediationRecipesRequest();
            request.id = id;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRemediationRecipesRequest(id, sortBy, lifecycleState, sortOrder, displayName,
            // limit, page, compartmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
                .sortOrder(sortOrder)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .compartmentId(compartmentId)
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRemediationRecipesRequest)) {
            return false;
        }

        ListRemediationRecipesRequest other = (ListRemediationRecipesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
