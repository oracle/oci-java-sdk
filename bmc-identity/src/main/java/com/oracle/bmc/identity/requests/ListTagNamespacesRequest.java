/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTagNamespacesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTagNamespacesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListTagNamespacesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    private String compartmentId;

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * An optional boolean parameter indicating whether to retrieve all tag namespaces in
     * subcompartments. If this parameter is not specified, only the tag namespaces defined in the
     * specified compartment are retrieved.
     */
    private Boolean includeSubcompartments;

    /**
     * An optional boolean parameter indicating whether to retrieve all tag namespaces in
     * subcompartments. If this parameter is not specified, only the tag namespaces defined in the
     * specified compartment are retrieved.
     */
    public Boolean getIncludeSubcompartments() {
        return includeSubcompartments;
    }
    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.identity.model.TagNamespace.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.identity.model.TagNamespace.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTagNamespacesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * An optional boolean parameter indicating whether to retrieve all tag namespaces in
         * subcompartments. If this parameter is not specified, only the tag namespaces defined in
         * the specified compartment are retrieved.
         */
        private Boolean includeSubcompartments = null;

        /**
         * An optional boolean parameter indicating whether to retrieve all tag namespaces in
         * subcompartments. If this parameter is not specified, only the tag namespaces defined in
         * the specified compartment are retrieved.
         *
         * @param includeSubcompartments the value to set
         * @return this builder instance
         */
        public Builder includeSubcompartments(Boolean includeSubcompartments) {
            this.includeSubcompartments = includeSubcompartments;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.identity.model.TagNamespace.LifecycleState lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.identity.model.TagNamespace.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListTagNamespacesRequest o) {
            compartmentId(o.getCompartmentId());
            page(o.getPage());
            limit(o.getLimit());
            includeSubcompartments(o.getIncludeSubcompartments());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTagNamespacesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListTagNamespacesRequest
         */
        public ListTagNamespacesRequest build() {
            ListTagNamespacesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTagNamespacesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTagNamespacesRequest
         */
        public ListTagNamespacesRequest buildWithoutInvocationCallback() {
            ListTagNamespacesRequest request = new ListTagNamespacesRequest();
            request.compartmentId = compartmentId;
            request.page = page;
            request.limit = limit;
            request.includeSubcompartments = includeSubcompartments;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListTagNamespacesRequest(compartmentId, page, limit, includeSubcompartments,
            // lifecycleState);
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
                .page(page)
                .limit(limit)
                .includeSubcompartments(includeSubcompartments)
                .lifecycleState(lifecycleState);
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
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",includeSubcompartments=").append(String.valueOf(this.includeSubcompartments));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTagNamespacesRequest)) {
            return false;
        }

        ListTagNamespacesRequest other = (ListTagNamespacesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.includeSubcompartments, other.includeSubcompartments)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.includeSubcompartments == null
                                ? 43
                                : this.includeSubcompartments.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
