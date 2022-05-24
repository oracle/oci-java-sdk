/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Details of a resource that is consuming a particular product license.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProductLicenseConsumerSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProductLicenseConsumerSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
        private String resourceCompartmentName;

        public Builder resourceCompartmentName(String resourceCompartmentName) {
            this.resourceCompartmentName = resourceCompartmentName;
            this.__explicitlySet__.add("resourceCompartmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitType")
        private ResourceUnit resourceUnitType;

        public Builder resourceUnitType(ResourceUnit resourceUnitType) {
            this.resourceUnitType = resourceUnitType;
            this.__explicitlySet__.add("resourceUnitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitCount")
        private Double resourceUnitCount;

        public Builder resourceUnitCount(Double resourceUnitCount) {
            this.resourceUnitCount = resourceUnitCount;
            this.__explicitlySet__.add("resourceUnitCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitType")
        private LicenseUnit licenseUnitType;

        public Builder licenseUnitType(LicenseUnit licenseUnitType) {
            this.licenseUnitType = licenseUnitType;
            this.__explicitlySet__.add("licenseUnitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitsConsumed")
        private Double licenseUnitsConsumed;

        public Builder licenseUnitsConsumed(Double licenseUnitsConsumed) {
            this.licenseUnitsConsumed = licenseUnitsConsumed;
            this.__explicitlySet__.add("licenseUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBaseLicenseAvailable")
        private Boolean isBaseLicenseAvailable;

        public Builder isBaseLicenseAvailable(Boolean isBaseLicenseAvailable) {
            this.isBaseLicenseAvailable = isBaseLicenseAvailable;
            this.__explicitlySet__.add("isBaseLicenseAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("areAllOptionsAvailable")
        private Boolean areAllOptionsAvailable;

        public Builder areAllOptionsAvailable(Boolean areAllOptionsAvailable) {
            this.areAllOptionsAvailable = areAllOptionsAvailable;
            this.__explicitlySet__.add("areAllOptionsAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("missingProducts")
        private java.util.List<Product> missingProducts;

        public Builder missingProducts(java.util.List<Product> missingProducts) {
            this.missingProducts = missingProducts;
            this.__explicitlySet__.add("missingProducts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductLicenseConsumerSummary build() {
            ProductLicenseConsumerSummary __instance__ =
                    new ProductLicenseConsumerSummary(
                            resourceId,
                            resourceName,
                            productName,
                            resourceCompartmentId,
                            resourceCompartmentName,
                            resourceUnitType,
                            resourceUnitCount,
                            licenseUnitType,
                            licenseUnitsConsumed,
                            isBaseLicenseAvailable,
                            areAllOptionsAvailable,
                            missingProducts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductLicenseConsumerSummary o) {
            Builder copiedBuilder =
                    resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .productName(o.getProductName())
                            .resourceCompartmentId(o.getResourceCompartmentId())
                            .resourceCompartmentName(o.getResourceCompartmentName())
                            .resourceUnitType(o.getResourceUnitType())
                            .resourceUnitCount(o.getResourceUnitCount())
                            .licenseUnitType(o.getLicenseUnitType())
                            .licenseUnitsConsumed(o.getLicenseUnitsConsumed())
                            .isBaseLicenseAvailable(o.getIsBaseLicenseAvailable())
                            .areAllOptionsAvailable(o.getAreAllOptionsAvailable())
                            .missingProducts(o.getMissingProducts());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The display name of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The resource product name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    String productName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    String resourceCompartmentId;

    /**
     * The display name of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
    String resourceCompartmentName;

    /**
     * The unit type for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitType")
    ResourceUnit resourceUnitType;

    /**
     * Number of units of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitCount")
    Double resourceUnitCount;

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitType")
    LicenseUnit licenseUnitType;

    /**
     * Number of license units consumed by the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitsConsumed")
    Double licenseUnitsConsumed;

    /**
     * Specifies if the base license is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseLicenseAvailable")
    Boolean isBaseLicenseAvailable;

    /**
     * Specifies if all options are available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAllOptionsAvailable")
    Boolean areAllOptionsAvailable;

    /**
     * Collection of missing product licenses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("missingProducts")
    java.util.List<Product> missingProducts;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
