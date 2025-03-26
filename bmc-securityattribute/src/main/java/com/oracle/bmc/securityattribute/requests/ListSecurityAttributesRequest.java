/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.requests;

import com.oracle.bmc.securityattribute.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/securityattribute/ListSecurityAttributesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSecurityAttributesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class ListSecurityAttributesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the security attribute namespace.
     *
     */
    private String securityAttributeNamespaceId;

    /**
     * The OCID of the security attribute namespace.
     *
     */
    public String getSecurityAttributeNamespaceId() {
        return securityAttributeNamespaceId;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     *
     */
    private com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     *
     */
    public com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSecurityAttributesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the security attribute namespace.
         *
         */
        private String securityAttributeNamespaceId = null;

        /**
         * The OCID of the security attribute namespace.
         *
         * @param securityAttributeNamespaceId the value to set
         * @return this builder instance
         */
        public Builder securityAttributeNamespaceId(String securityAttributeNamespaceId) {
            this.securityAttributeNamespaceId = securityAttributeNamespaceId;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
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

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         */
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         *
         */
        private com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState
                lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListSecurityAttributesRequest o) {
            securityAttributeNamespaceId(o.getSecurityAttributeNamespaceId());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSecurityAttributesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSecurityAttributesRequest
         */
        public ListSecurityAttributesRequest build() {
            ListSecurityAttributesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSecurityAttributesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSecurityAttributesRequest
         */
        public ListSecurityAttributesRequest buildWithoutInvocationCallback() {
            ListSecurityAttributesRequest request = new ListSecurityAttributesRequest();
            request.securityAttributeNamespaceId = securityAttributeNamespaceId;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListSecurityAttributesRequest(securityAttributeNamespaceId, page, limit, opcRequestId, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityAttributeNamespaceId(securityAttributeNamespaceId)
                .page(page)
                .limit(limit)
                .opcRequestId(opcRequestId)
                .lifecycleState(lifecycleState);
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
        sb.append(",securityAttributeNamespaceId=")
                .append(String.valueOf(this.securityAttributeNamespaceId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSecurityAttributesRequest)) {
            return false;
        }

        ListSecurityAttributesRequest other = (ListSecurityAttributesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.securityAttributeNamespaceId, other.securityAttributeNamespaceId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityAttributeNamespaceId == null
                                ? 43
                                : this.securityAttributeNamespaceId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
