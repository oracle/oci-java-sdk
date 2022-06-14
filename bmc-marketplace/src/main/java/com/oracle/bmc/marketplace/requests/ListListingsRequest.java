/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListListingsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListListingsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class ListListingsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The name of the listing.
     */
    private java.util.List<String> name;

    /**
     * The name of the listing.
     */
    public java.util.List<String> getName() {
        return name;
    }
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
     * The image identifier of the listing.
     */
    private String imageId;

    /**
     * The image identifier of the listing.
     */
    public String getImageId() {
        return imageId;
    }
    /**
     * Limit results to just this publisher.
     */
    private String publisherId;

    /**
     * Limit results to just this publisher.
     */
    public String getPublisherId() {
        return publisherId;
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
     * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
     * one or more matching categories.
     *
     */
    private java.util.List<String> category;

    /**
     * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
     * one or more matching categories.
     *
     */
    public java.util.List<String> getCategory() {
        return category;
    }
    /**
     * Name of the pricing type. If multiple pricing types are provided, then any listing with
     * one or more matching pricing models will be returned.
     *
     */
    private java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing;

    /**
     * Name of the pricing type. If multiple pricing types are provided, then any listing with
     * one or more matching pricing models will be returned.
     *
     */
    public java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> getPricing() {
        return pricing;
    }
    /**
     * Indicates whether to show only featured listings. If this is set to {@code false} or is omitted, then all listings will be returned.
     *
     */
    private Boolean isFeatured;

    /**
     * Indicates whether to show only featured listings. If this is set to {@code false} or is omitted, then all listings will be returned.
     *
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }
    /**
     * The type of the listing.
     */
    private java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes;

    /**
     * The type of the listing.
     */
    public java.util.List<com.oracle.bmc.marketplace.model.ListingType> getListingTypes() {
        return listingTypes;
    }
    /**
     * The operating system of the listing.
     */
    private java.util.List<String> operatingSystems;

    /**
     * The operating system of the listing.
     */
    public java.util.List<String> getOperatingSystems() {
        return operatingSystems;
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
                    ListListingsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The name of the listing.
         */
        private java.util.List<String> name = null;

        /**
         * The name of the listing.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. The name of the listing.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

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
         * The image identifier of the listing.
         */
        private String imageId = null;

        /**
         * The image identifier of the listing.
         * @param imageId the value to set
         * @return this builder instance
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * Limit results to just this publisher.
         */
        private String publisherId = null;

        /**
         * Limit results to just this publisher.
         * @param publisherId the value to set
         * @return this builder instance
         */
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
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
         * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
         * one or more matching categories.
         *
         */
        private java.util.List<String> category = null;

        /**
         * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
         * one or more matching categories.
         *
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(java.util.List<String> category) {
            this.category = category;
            return this;
        }

        /**
         * Singular setter. Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with
         * one or more matching categories.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder category(String singularValue) {
            return this.category(java.util.Arrays.asList(singularValue));
        }

        /**
         * Name of the pricing type. If multiple pricing types are provided, then any listing with
         * one or more matching pricing models will be returned.
         *
         */
        private java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing = null;

        /**
         * Name of the pricing type. If multiple pricing types are provided, then any listing with
         * one or more matching pricing models will be returned.
         *
         * @param pricing the value to set
         * @return this builder instance
         */
        public Builder pricing(
                java.util.List<com.oracle.bmc.marketplace.model.PricingTypeEnum> pricing) {
            this.pricing = pricing;
            return this;
        }

        /**
         * Singular setter. Name of the pricing type. If multiple pricing types are provided, then any listing with
         * one or more matching pricing models will be returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder pricing(PricingTypeEnum singularValue) {
            return this.pricing(java.util.Arrays.asList(singularValue));
        }

        /**
         * Indicates whether to show only featured listings. If this is set to {@code false} or is omitted, then all listings will be returned.
         *
         */
        private Boolean isFeatured = null;

        /**
         * Indicates whether to show only featured listings. If this is set to {@code false} or is omitted, then all listings will be returned.
         *
         * @param isFeatured the value to set
         * @return this builder instance
         */
        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            return this;
        }

        /**
         * The type of the listing.
         */
        private java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes = null;

        /**
         * The type of the listing.
         * @param listingTypes the value to set
         * @return this builder instance
         */
        public Builder listingTypes(
                java.util.List<com.oracle.bmc.marketplace.model.ListingType> listingTypes) {
            this.listingTypes = listingTypes;
            return this;
        }

        /**
         * Singular setter. The type of the listing.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder listingTypes(ListingType singularValue) {
            return this.listingTypes(java.util.Arrays.asList(singularValue));
        }

        /**
         * The operating system of the listing.
         */
        private java.util.List<String> operatingSystems = null;

        /**
         * The operating system of the listing.
         * @param operatingSystems the value to set
         * @return this builder instance
         */
        public Builder operatingSystems(java.util.List<String> operatingSystems) {
            this.operatingSystems = operatingSystems;
            return this;
        }

        /**
         * Singular setter. The operating system of the listing.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder operatingSystems(String singularValue) {
            return this.operatingSystems(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListListingsRequest o) {
            name(o.getName());
            listingId(o.getListingId());
            imageId(o.getImageId());
            publisherId(o.getPublisherId());
            packageType(o.getPackageType());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            category(o.getCategory());
            pricing(o.getPricing());
            isFeatured(o.getIsFeatured());
            listingTypes(o.getListingTypes());
            operatingSystems(o.getOperatingSystems());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListListingsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListListingsRequest
         */
        public ListListingsRequest build() {
            ListListingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListListingsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListListingsRequest
         */
        public ListListingsRequest buildWithoutInvocationCallback() {
            ListListingsRequest request = new ListListingsRequest();
            request.name = name;
            request.listingId = listingId;
            request.imageId = imageId;
            request.publisherId = publisherId;
            request.packageType = packageType;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.category = category;
            request.pricing = pricing;
            request.isFeatured = isFeatured;
            request.listingTypes = listingTypes;
            request.operatingSystems = operatingSystems;
            request.compartmentId = compartmentId;
            return request;
            // new ListListingsRequest(name, listingId, imageId, publisherId, packageType, opcRequestId, limit, page, sortBy, sortOrder, category, pricing, isFeatured, listingTypes, operatingSystems, compartmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .name(name)
                .listingId(listingId)
                .imageId(imageId)
                .publisherId(publisherId)
                .packageType(packageType)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .category(category)
                .pricing(pricing)
                .isFeatured(isFeatured)
                .listingTypes(listingTypes)
                .operatingSystems(operatingSystems)
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
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",listingId=").append(String.valueOf(this.listingId));
        sb.append(",imageId=").append(String.valueOf(this.imageId));
        sb.append(",publisherId=").append(String.valueOf(this.publisherId));
        sb.append(",packageType=").append(String.valueOf(this.packageType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",pricing=").append(String.valueOf(this.pricing));
        sb.append(",isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(",listingTypes=").append(String.valueOf(this.listingTypes));
        sb.append(",operatingSystems=").append(String.valueOf(this.operatingSystems));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListListingsRequest)) {
            return false;
        }

        ListListingsRequest other = (ListListingsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.isFeatured, other.isFeatured)
                && java.util.Objects.equals(this.listingTypes, other.listingTypes)
                && java.util.Objects.equals(this.operatingSystems, other.operatingSystems)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result = (result * PRIME) + (this.isFeatured == null ? 43 : this.isFeatured.hashCode());
        result = (result * PRIME) + (this.listingTypes == null ? 43 : this.listingTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystems == null ? 43 : this.operatingSystems.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
