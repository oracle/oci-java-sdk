/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.requests;

import com.oracle.bmc.ociproductcatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ociproductcatalog/ListProductsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProductsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
public class ListProductsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The bPartNumber of the SKU to be used to filter the result. All the product has this sku in
     * the skus list will be returned
     */
    private String skusContains;

    /**
     * The bPartNumber of the SKU to be used to filter the result. All the product has this sku in
     * the skus list will be returned
     */
    public String getSkusContains() {
        return skusContains;
    }
    /** The name of the product to be queried */
    private String name;

    /** The name of the product to be queried */
    public String getName() {
        return name;
    }
    /** The lifecycleState used to filter the result */
    private String lifecycleState;

    /** The lifecycleState used to filter the result */
    public String getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only the products with {@code timeReady} field greater than or equal to
     * given value. Example: {@code 2022-01-25T21:10:29.600Z}
     */
    private java.util.Date timeReadyGreaterThanOrEqualTo;

    /**
     * A filter to return only the products with {@code timeReady} field greater than or equal to
     * given value. Example: {@code 2022-01-25T21:10:29.600Z}
     */
    public java.util.Date getTimeReadyGreaterThanOrEqualTo() {
        return timeReadyGreaterThanOrEqualTo;
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
    /** The OCID of the product to be queried */
    private String id;

    /** The OCID of the product to be queried */
    public String getId() {
        return id;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProductsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The bPartNumber of the SKU to be used to filter the result. All the product has this sku
         * in the skus list will be returned
         */
        private String skusContains = null;

        /**
         * The bPartNumber of the SKU to be used to filter the result. All the product has this sku
         * in the skus list will be returned
         *
         * @param skusContains the value to set
         * @return this builder instance
         */
        public Builder skusContains(String skusContains) {
            this.skusContains = skusContains;
            return this;
        }

        /** The name of the product to be queried */
        private String name = null;

        /**
         * The name of the product to be queried
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** The lifecycleState used to filter the result */
        private String lifecycleState = null;

        /**
         * The lifecycleState used to filter the result
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only the products with {@code timeReady} field greater than or equal
         * to given value. Example: {@code 2022-01-25T21:10:29.600Z}
         */
        private java.util.Date timeReadyGreaterThanOrEqualTo = null;

        /**
         * A filter to return only the products with {@code timeReady} field greater than or equal
         * to given value. Example: {@code 2022-01-25T21:10:29.600Z}
         *
         * @param timeReadyGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeReadyGreaterThanOrEqualTo(java.util.Date timeReadyGreaterThanOrEqualTo) {
            this.timeReadyGreaterThanOrEqualTo = timeReadyGreaterThanOrEqualTo;
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

        /** The OCID of the product to be queried */
        private String id = null;

        /**
         * The OCID of the product to be queried
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
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
        public Builder copy(ListProductsRequest o) {
            opcRequestId(o.getOpcRequestId());
            skusContains(o.getSkusContains());
            name(o.getName());
            lifecycleState(o.getLifecycleState());
            timeReadyGreaterThanOrEqualTo(o.getTimeReadyGreaterThanOrEqualTo());
            page(o.getPage());
            limit(o.getLimit());
            id(o.getId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListProductsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListProductsRequest
         */
        public ListProductsRequest build() {
            ListProductsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProductsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProductsRequest
         */
        public ListProductsRequest buildWithoutInvocationCallback() {
            ListProductsRequest request = new ListProductsRequest();
            request.opcRequestId = opcRequestId;
            request.skusContains = skusContains;
            request.name = name;
            request.lifecycleState = lifecycleState;
            request.timeReadyGreaterThanOrEqualTo = timeReadyGreaterThanOrEqualTo;
            request.page = page;
            request.limit = limit;
            request.id = id;
            return request;
            // new ListProductsRequest(opcRequestId, skusContains, name, lifecycleState,
            // timeReadyGreaterThanOrEqualTo, page, limit, id);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .skusContains(skusContains)
                .name(name)
                .lifecycleState(lifecycleState)
                .timeReadyGreaterThanOrEqualTo(timeReadyGreaterThanOrEqualTo)
                .page(page)
                .limit(limit)
                .id(id);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",skusContains=").append(String.valueOf(this.skusContains));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeReadyGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeReadyGreaterThanOrEqualTo));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListProductsRequest)) {
            return false;
        }

        ListProductsRequest other = (ListProductsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.skusContains, other.skusContains)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.timeReadyGreaterThanOrEqualTo, other.timeReadyGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.skusContains == null ? 43 : this.skusContains.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReadyGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeReadyGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        return result;
    }
}
