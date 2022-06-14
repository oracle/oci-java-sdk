/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/ListPrivateApplicationPackagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPrivateApplicationPackagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ListPrivateApplicationPackagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the private application.
     */
    private String privateApplicationId;

    /**
     * The unique identifier for the private application.
     */
    public String getPrivateApplicationId() {
        return privateApplicationId;
    }
    /**
     * The unique identifier for the private application package.
     */
    private String privateApplicationPackageId;

    /**
     * The unique identifier for the private application package.
     */
    public String getPrivateApplicationPackageId() {
        return privateApplicationPackageId;
    }
    /**
     * Name of the package type. If multiple package types are provided, then any resource with
     * one or more matching package types will be returned.
     *
     */
    private java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> packageType;

    /**
     * Name of the package type. If multiple package types are provided, then any resource with
     * one or more matching package types will be returned.
     *
     */
    public java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> getPackageType() {
        return packageType;
    }
    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
     *
     */
    private Integer limit;

    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMECREATED} displays results in descending order by default. You can change your
     * preference by specifying a different sort order.
     *
     */
    private SortBy sortBy;

    /**
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMECREATED} displays results in descending order by default. You can change your
     * preference by specifying a different sort order.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Version("VERSION"),
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
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMECREATED} displays results in descending order by default. You can change your
     * preference by specifying a different sort order.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Exact match name filter.
     */
    private String displayName;

    /**
     * Exact match name filter.
     */
    public String getDisplayName() {
        return displayName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPrivateApplicationPackagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the private application.
         */
        private String privateApplicationId = null;

        /**
         * The unique identifier for the private application.
         * @param privateApplicationId the value to set
         * @return this builder instance
         */
        public Builder privateApplicationId(String privateApplicationId) {
            this.privateApplicationId = privateApplicationId;
            return this;
        }

        /**
         * The unique identifier for the private application package.
         */
        private String privateApplicationPackageId = null;

        /**
         * The unique identifier for the private application package.
         * @param privateApplicationPackageId the value to set
         * @return this builder instance
         */
        public Builder privateApplicationPackageId(String privateApplicationPackageId) {
            this.privateApplicationPackageId = privateApplicationPackageId;
            return this;
        }

        /**
         * Name of the package type. If multiple package types are provided, then any resource with
         * one or more matching package types will be returned.
         *
         */
        private java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> packageType =
                null;

        /**
         * Name of the package type. If multiple package types are provided, then any resource with
         * one or more matching package types will be returned.
         *
         * @param packageType the value to set
         * @return this builder instance
         */
        public Builder packageType(
                java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * Singular setter. Name of the package type. If multiple package types are provided, then any resource with
         * one or more matching package types will be returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder packageType(PackageTypeEnum singularValue) {
            return this.packageType(java.util.Arrays.asList(singularValue));
        }

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
         *
         */
        private Integer limit = null;

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMECREATED} displays results in descending order by default. You can change your
         * preference by specifying a different sort order.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMECREATED} displays results in descending order by default. You can change your
         * preference by specifying a different sort order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Exact match name filter.
         */
        private String displayName = null;

        /**
         * Exact match name filter.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        public Builder copy(ListPrivateApplicationPackagesRequest o) {
            privateApplicationId(o.getPrivateApplicationId());
            privateApplicationPackageId(o.getPrivateApplicationPackageId());
            packageType(o.getPackageType());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            displayName(o.getDisplayName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPrivateApplicationPackagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPrivateApplicationPackagesRequest
         */
        public ListPrivateApplicationPackagesRequest build() {
            ListPrivateApplicationPackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPrivateApplicationPackagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPrivateApplicationPackagesRequest
         */
        public ListPrivateApplicationPackagesRequest buildWithoutInvocationCallback() {
            ListPrivateApplicationPackagesRequest request =
                    new ListPrivateApplicationPackagesRequest();
            request.privateApplicationId = privateApplicationId;
            request.privateApplicationPackageId = privateApplicationPackageId;
            request.packageType = packageType;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            return request;
            // new ListPrivateApplicationPackagesRequest(privateApplicationId, privateApplicationPackageId, packageType, limit, page, opcRequestId, sortBy, sortOrder, displayName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .privateApplicationId(privateApplicationId)
                .privateApplicationPackageId(privateApplicationPackageId)
                .packageType(packageType)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .displayName(displayName);
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
        sb.append(",privateApplicationId=").append(String.valueOf(this.privateApplicationId));
        sb.append(",privateApplicationPackageId=")
                .append(String.valueOf(this.privateApplicationPackageId));
        sb.append(",packageType=").append(String.valueOf(this.packageType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateApplicationPackagesRequest)) {
            return false;
        }

        ListPrivateApplicationPackagesRequest other = (ListPrivateApplicationPackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.privateApplicationId, other.privateApplicationId)
                && java.util.Objects.equals(
                        this.privateApplicationPackageId, other.privateApplicationPackageId)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateApplicationId == null
                                ? 43
                                : this.privateApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateApplicationPackageId == null
                                ? 43
                                : this.privateApplicationPackageId.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }
}
