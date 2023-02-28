/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/ListApplicationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListApplicationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ListApplicationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique identifier for the compartment. */
    private String compartmentId;

    /** The unique identifier for the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The unique identifier for the service catalog. */
    private String serviceCatalogId;

    /** The unique identifier for the service catalog. */
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }
    /** The type of the application in the service catalog. */
    private String entityType;

    /** The type of the application in the service catalog. */
    public String getEntityType() {
        return entityType;
    }
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
     * How many records to return. Specify a value greater than zero and less than or equal to 1000.
     * The default is 30.
     */
    private Integer limit;

    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000.
     * The default is 30.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** Exact match name filter. */
    private String displayName;

    /** Exact match name filter. */
    public String getDisplayName() {
        return displayName;
    }
    /** The unique identifier of the entity associated with service catalog. */
    private String entityId;

    /** The unique identifier of the entity associated with service catalog. */
    public String getEntityId() {
        return entityId;
    }
    /** Limit results to just this publisher. */
    private java.util.List<String> publisherId;

    /** Limit results to just this publisher. */
    public java.util.List<String> getPublisherId() {
        return publisherId;
    }
    /**
     * Name of the package type. If multiple package types are provided, then any resource with one
     * or more matching package types will be returned.
     */
    private java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> packageType;

    /**
     * Name of the package type. If multiple package types are provided, then any resource with one
     * or more matching package types will be returned.
     */
    public java.util.List<com.oracle.bmc.servicecatalog.model.PackageTypeEnum> getPackageType() {
        return packageType;
    }
    /**
     * Name of the pricing type. If multiple pricing types are provided, then any resource with one
     * or more matching pricing models will be returned.
     */
    private java.util.List<com.oracle.bmc.servicecatalog.model.PricingTypeEnum> pricing;

    /**
     * Name of the pricing type. If multiple pricing types are provided, then any resource with one
     * or more matching pricing models will be returned.
     */
    public java.util.List<com.oracle.bmc.servicecatalog.model.PricingTypeEnum> getPricing() {
        return pricing;
    }
    /**
     * Indicates whether to show only featured resources. If this is set to {@code false} or is
     * omitted, then all resources will be returned.
     */
    private Boolean isFeatured;

    /**
     * Indicates whether to show only featured resources. If this is set to {@code false} or is
     * omitted, then all resources will be returned.
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }
    /** The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}. */
    private SortOrder sortOrder;

    /** The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListApplicationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier for the compartment. */
        private String compartmentId = null;

        /**
         * The unique identifier for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The unique identifier for the service catalog. */
        private String serviceCatalogId = null;

        /**
         * The unique identifier for the service catalog.
         *
         * @param serviceCatalogId the value to set
         * @return this builder instance
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            return this;
        }

        /** The type of the application in the service catalog. */
        private String entityType = null;

        /**
         * The type of the application in the service catalog.
         *
         * @param entityType the value to set
         * @return this builder instance
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

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
         * How many records to return. Specify a value greater than zero and less than or equal to
         * 1000. The default is 30.
         */
        private Integer limit = null;

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to
         * 1000. The default is 30.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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

        /** Exact match name filter. */
        private String displayName = null;

        /**
         * Exact match name filter.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The unique identifier of the entity associated with service catalog. */
        private String entityId = null;

        /**
         * The unique identifier of the entity associated with service catalog.
         *
         * @param entityId the value to set
         * @return this builder instance
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /** Limit results to just this publisher. */
        private java.util.List<String> publisherId = null;

        /**
         * Limit results to just this publisher.
         *
         * @param publisherId the value to set
         * @return this builder instance
         */
        public Builder publisherId(java.util.List<String> publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        /**
         * Singular setter. Limit results to just this publisher.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder publisherId(String singularValue) {
            return this.publisherId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Name of the package type. If multiple package types are provided, then any resource with
         * one or more matching package types will be returned.
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
         * Singular setter. Name of the package type. If multiple package types are provided, then
         * any resource with one or more matching package types will be returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder packageType(PackageTypeEnum singularValue) {
            return this.packageType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Name of the pricing type. If multiple pricing types are provided, then any resource with
         * one or more matching pricing models will be returned.
         */
        private java.util.List<com.oracle.bmc.servicecatalog.model.PricingTypeEnum> pricing = null;

        /**
         * Name of the pricing type. If multiple pricing types are provided, then any resource with
         * one or more matching pricing models will be returned.
         *
         * @param pricing the value to set
         * @return this builder instance
         */
        public Builder pricing(
                java.util.List<com.oracle.bmc.servicecatalog.model.PricingTypeEnum> pricing) {
            this.pricing = pricing;
            return this;
        }

        /**
         * Singular setter. Name of the pricing type. If multiple pricing types are provided, then
         * any resource with one or more matching pricing models will be returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder pricing(PricingTypeEnum singularValue) {
            return this.pricing(java.util.Arrays.asList(singularValue));
        }

        /**
         * Indicates whether to show only featured resources. If this is set to {@code false} or is
         * omitted, then all resources will be returned.
         */
        private Boolean isFeatured = null;

        /**
         * Indicates whether to show only featured resources. If this is set to {@code false} or is
         * omitted, then all resources will be returned.
         *
         * @param isFeatured the value to set
         * @return this builder instance
         */
        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            return this;
        }

        /** The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListApplicationsRequest o) {
            compartmentId(o.getCompartmentId());
            serviceCatalogId(o.getServiceCatalogId());
            entityType(o.getEntityType());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            displayName(o.getDisplayName());
            entityId(o.getEntityId());
            publisherId(o.getPublisherId());
            packageType(o.getPackageType());
            pricing(o.getPricing());
            isFeatured(o.getIsFeatured());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListApplicationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListApplicationsRequest
         */
        public ListApplicationsRequest build() {
            ListApplicationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListApplicationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListApplicationsRequest
         */
        public ListApplicationsRequest buildWithoutInvocationCallback() {
            ListApplicationsRequest request = new ListApplicationsRequest();
            request.compartmentId = compartmentId;
            request.serviceCatalogId = serviceCatalogId;
            request.entityType = entityType;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.displayName = displayName;
            request.entityId = entityId;
            request.publisherId = publisherId;
            request.packageType = packageType;
            request.pricing = pricing;
            request.isFeatured = isFeatured;
            request.sortOrder = sortOrder;
            return request;
            // new ListApplicationsRequest(compartmentId, serviceCatalogId, entityType,
            // opcRequestId, limit, page, displayName, entityId, publisherId, packageType, pricing,
            // isFeatured, sortOrder);
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
                .serviceCatalogId(serviceCatalogId)
                .entityType(entityType)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .displayName(displayName)
                .entityId(entityId)
                .publisherId(publisherId)
                .packageType(packageType)
                .pricing(pricing)
                .isFeatured(isFeatured)
                .sortOrder(sortOrder);
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
        sb.append(",serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(",entityType=").append(String.valueOf(this.entityType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",entityId=").append(String.valueOf(this.entityId));
        sb.append(",publisherId=").append(String.valueOf(this.publisherId));
        sb.append(",packageType=").append(String.valueOf(this.packageType));
        sb.append(",pricing=").append(String.valueOf(this.pricing));
        sb.append(",isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListApplicationsRequest)) {
            return false;
        }

        ListApplicationsRequest other = (ListApplicationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.isFeatured, other.isFeatured)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
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
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result = (result * PRIME) + (this.isFeatured == null ? 43 : this.isFeatured.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
