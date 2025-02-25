/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListPackagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPackagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class ListPackagesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the listing.
     */
    private String listingId;

    /**
     * The unique identifier for the listing.
     */
    public String getListingId() {
        return listingId;
    }
    /**
     * The version of the package. Package versions are unique within a listing.
     */
    private String packageVersion;

    /**
     * The version of the package. Package versions are unique within a listing.
     */
    public String getPackageVersion() {
        return packageVersion;
    }
    /**
     * A filter to return only packages that match the given package type exactly.
     *
     */
    private String packageType;

    /**
     * A filter to return only packages that match the given package type exactly.
     *
     */
    public String getPackageType() {
        return packageType;
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
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMERELEASED} displays results in descending order by default.
     * You can change your preference by specifying a different sort order.
     *
     */
    private SortBy sortBy;

    /**
     * The field to use to sort listed results. You can only specify one field to sort by.
     * {@code TIMERELEASED} displays results in descending order by default.
     * You can change your preference by specifying a different sort order.
     *
     **/
    public enum SortBy {
        Timereleased("TIMERELEASED"),
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
     * {@code TIMERELEASED} displays results in descending order by default.
     * You can change your preference by specifying a different sort order.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either {@code ASC} or {@code DESC}.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either {@code ASC} or {@code DESC}.
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
     * The sort order to use, either {@code ASC} or {@code DESC}.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The unique identifier for the compartment.
     */
    private String compartmentId;

    /**
     * The unique identifier for the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPackagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the listing.
         */
        private String listingId = null;

        /**
         * The unique identifier for the listing.
         * @param listingId the value to set
         * @return this builder instance
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            return this;
        }

        /**
         * The version of the package. Package versions are unique within a listing.
         */
        private String packageVersion = null;

        /**
         * The version of the package. Package versions are unique within a listing.
         * @param packageVersion the value to set
         * @return this builder instance
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * A filter to return only packages that match the given package type exactly.
         *
         */
        private String packageType = null;

        /**
         * A filter to return only packages that match the given package type exactly.
         *
         * @param packageType the value to set
         * @return this builder instance
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
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
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMERELEASED} displays results in descending order by default.
         * You can change your preference by specifying a different sort order.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to use to sort listed results. You can only specify one field to sort by.
         * {@code TIMERELEASED} displays results in descending order by default.
         * You can change your preference by specifying a different sort order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either {@code ASC} or {@code DESC}.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either {@code ASC} or {@code DESC}.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The unique identifier for the compartment.
         */
        private String compartmentId = null;

        /**
         * The unique identifier for the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(ListPackagesRequest o) {
            listingId(o.getListingId());
            packageVersion(o.getPackageVersion());
            packageType(o.getPackageType());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPackagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPackagesRequest
         */
        public ListPackagesRequest build() {
            ListPackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPackagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPackagesRequest
         */
        public ListPackagesRequest buildWithoutInvocationCallback() {
            ListPackagesRequest request = new ListPackagesRequest();
            request.listingId = listingId;
            request.packageVersion = packageVersion;
            request.packageType = packageType;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.compartmentId = compartmentId;
            return request;
            // new ListPackagesRequest(listingId, packageVersion, packageType, opcRequestId, limit, page, sortBy, sortOrder, compartmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .listingId(listingId)
                .packageVersion(packageVersion)
                .packageType(packageType)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .compartmentId(compartmentId);
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
        sb.append(",listingId=").append(String.valueOf(this.listingId));
        sb.append(",packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(",packageType=").append(String.valueOf(this.packageType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPackagesRequest)) {
            return false;
        }

        ListPackagesRequest other = (ListPackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
