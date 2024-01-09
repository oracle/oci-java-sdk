/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListTagDefaultsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTagDefaultsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListTagDefaultsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** A filter to only return resources that match the specified OCID exactly. */
    private String id;

    /** A filter to only return resources that match the specified OCID exactly. */
    public String getId() {
        return id;
    }
    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    private String compartmentId;

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The OCID of the tag definition. */
    private String tagDefinitionId;

    /** The OCID of the tag definition. */
    public String getTagDefinitionId() {
        return tagDefinitionId;
    }
    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.identity.model.TagDefaultSummary.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.identity.model.TagDefaultSummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTagDefaultsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /** A filter to only return resources that match the specified OCID exactly. */
        private String id = null;

        /**
         * A filter to only return resources that match the specified OCID exactly.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

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

        /** The OCID of the tag definition. */
        private String tagDefinitionId = null;

        /**
         * The OCID of the tag definition.
         *
         * @param tagDefinitionId the value to set
         * @return this builder instance
         */
        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.identity.model.TagDefaultSummary.LifecycleState lifecycleState =
                null;

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.identity.model.TagDefaultSummary.LifecycleState lifecycleState) {
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
        public Builder copy(ListTagDefaultsRequest o) {
            page(o.getPage());
            limit(o.getLimit());
            id(o.getId());
            compartmentId(o.getCompartmentId());
            tagDefinitionId(o.getTagDefinitionId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTagDefaultsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListTagDefaultsRequest
         */
        public ListTagDefaultsRequest build() {
            ListTagDefaultsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTagDefaultsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTagDefaultsRequest
         */
        public ListTagDefaultsRequest buildWithoutInvocationCallback() {
            ListTagDefaultsRequest request = new ListTagDefaultsRequest();
            request.page = page;
            request.limit = limit;
            request.id = id;
            request.compartmentId = compartmentId;
            request.tagDefinitionId = tagDefinitionId;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListTagDefaultsRequest(page, limit, id, compartmentId, tagDefinitionId,
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
                .page(page)
                .limit(limit)
                .id(id)
                .compartmentId(compartmentId)
                .tagDefinitionId(tagDefinitionId)
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
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",tagDefinitionId=").append(String.valueOf(this.tagDefinitionId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTagDefaultsRequest)) {
            return false;
        }

        ListTagDefaultsRequest other = (ListTagDefaultsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tagDefinitionId, other.tagDefinitionId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionId == null ? 43 : this.tagDefinitionId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
