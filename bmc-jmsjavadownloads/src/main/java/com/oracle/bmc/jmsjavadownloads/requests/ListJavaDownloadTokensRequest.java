/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/ListJavaDownloadTokensExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJavaDownloadTokensRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class ListJavaDownloadTokensRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tenancy.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tenancy.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    private com.oracle.bmc.jmsjavadownloads.model.LifecycleState lifecycleState;

    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    public com.oracle.bmc.jmsjavadownloads.model.LifecycleState getLifecycleState() {
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
     * Unique JavaDownloadToken identifier.
     */
    private String id;

    /**
     * Unique JavaDownloadToken identifier.
     */
    public String getId() {
        return id;
    }
    /**
     * Unique JavaDownloadToken value.
     */
    private String value;

    /**
     * Unique JavaDownloadToken value.
     */
    public String getValue() {
        return value;
    }
    /**
     * Unique Java family version identifier.
     */
    private String familyVersion;

    /**
     * Unique Java family version identifier.
     */
    public String getFamilyVersion() {
        return familyVersion;
    }
    /**
     * A filter to return only resources that match the user principal detail.
     * The search string can be any of the property values from the {@link #principal(PrincipalRequest) principal} object.
     * This object is used as response datatype for the {@code createdBy} and {@code lastUpdatedBy} fields in applicable resource.
     *
     */
    private String searchByUser;

    /**
     * A filter to return only resources that match the user principal detail.
     * The search string can be any of the property values from the {@link #principal(PrincipalRequest) principal} object.
     * This object is used as response datatype for the {@code createdBy} and {@code lastUpdatedBy} fields in applicable resource.
     *
     */
    public String getSearchByUser() {
        return searchByUser;
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
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder;

    /**
     * The sort order, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.jmsjavadownloads.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. If no value is specified, _timeCreated_ is the default.
     *
     */
    private com.oracle.bmc.jmsjavadownloads.model.TokenSortBy sortBy;

    /**
     * The field to sort by. If no value is specified, _timeCreated_ is the default.
     *
     */
    public com.oracle.bmc.jmsjavadownloads.model.TokenSortBy getSortBy() {
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
                    ListJavaDownloadTokensRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tenancy.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tenancy.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.jmsjavadownloads.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.jmsjavadownloads.model.LifecycleState lifecycleState) {
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
         * Unique JavaDownloadToken identifier.
         */
        private String id = null;

        /**
         * Unique JavaDownloadToken identifier.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Unique JavaDownloadToken value.
         */
        private String value = null;

        /**
         * Unique JavaDownloadToken value.
         * @param value the value to set
         * @return this builder instance
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Unique Java family version identifier.
         */
        private String familyVersion = null;

        /**
         * Unique Java family version identifier.
         * @param familyVersion the value to set
         * @return this builder instance
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            return this;
        }

        /**
         * A filter to return only resources that match the user principal detail.
         * The search string can be any of the property values from the {@link #principal(PrincipalRequest) principal} object.
         * This object is used as response datatype for the {@code createdBy} and {@code lastUpdatedBy} fields in applicable resource.
         *
         */
        private String searchByUser = null;

        /**
         * A filter to return only resources that match the user principal detail.
         * The search string can be any of the property values from the {@link #principal(PrincipalRequest) principal} object.
         * This object is used as response datatype for the {@code createdBy} and {@code lastUpdatedBy} fields in applicable resource.
         *
         * @param searchByUser the value to set
         * @return this builder instance
         */
        public Builder searchByUser(String searchByUser) {
            this.searchByUser = searchByUser;
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
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jmsjavadownloads.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. If no value is specified, _timeCreated_ is the default.
         *
         */
        private com.oracle.bmc.jmsjavadownloads.model.TokenSortBy sortBy = null;

        /**
         * The field to sort by. If no value is specified, _timeCreated_ is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jmsjavadownloads.model.TokenSortBy sortBy) {
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
        public Builder copy(ListJavaDownloadTokensRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            value(o.getValue());
            familyVersion(o.getFamilyVersion());
            searchByUser(o.getSearchByUser());
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
         * Build the instance of ListJavaDownloadTokensRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJavaDownloadTokensRequest
         */
        public ListJavaDownloadTokensRequest build() {
            ListJavaDownloadTokensRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJavaDownloadTokensRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJavaDownloadTokensRequest
         */
        public ListJavaDownloadTokensRequest buildWithoutInvocationCallback() {
            ListJavaDownloadTokensRequest request = new ListJavaDownloadTokensRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.value = value;
            request.familyVersion = familyVersion;
            request.searchByUser = searchByUser;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJavaDownloadTokensRequest(compartmentId, lifecycleState, displayName, id, value, familyVersion, searchByUser, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .id(id)
                .value(value)
                .familyVersion(familyVersion)
                .searchByUser(searchByUser)
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",value=").append(String.valueOf(this.value));
        sb.append(",familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(",searchByUser=").append(String.valueOf(this.searchByUser));
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
        if (!(o instanceof ListJavaDownloadTokensRequest)) {
            return false;
        }

        ListJavaDownloadTokensRequest other = (ListJavaDownloadTokensRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.searchByUser, other.searchByUser)
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
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result = (result * PRIME) + (this.searchByUser == null ? 43 : this.searchByUser.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
