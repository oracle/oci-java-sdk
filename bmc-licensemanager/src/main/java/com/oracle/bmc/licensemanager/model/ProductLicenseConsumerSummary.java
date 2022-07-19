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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProductLicenseConsumerSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProductLicenseConsumerSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceName",
        "productName",
        "resourceCompartmentId",
        "resourceCompartmentName",
        "resourceUnitType",
        "resourceUnitCount",
        "licenseUnitType",
        "licenseUnitsConsumed",
        "isBaseLicenseAvailable",
        "areAllOptionsAvailable",
        "missingProducts"
    })
    public ProductLicenseConsumerSummary(
            String resourceId,
            String resourceName,
            String productName,
            String resourceCompartmentId,
            String resourceCompartmentName,
            ResourceUnit resourceUnitType,
            Double resourceUnitCount,
            LicenseUnit licenseUnitType,
            Double licenseUnitsConsumed,
            Boolean isBaseLicenseAvailable,
            Boolean areAllOptionsAvailable,
            java.util.List<Product> missingProducts) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.productName = productName;
        this.resourceCompartmentId = resourceCompartmentId;
        this.resourceCompartmentName = resourceCompartmentName;
        this.resourceUnitType = resourceUnitType;
        this.resourceUnitCount = resourceUnitCount;
        this.licenseUnitType = licenseUnitType;
        this.licenseUnitsConsumed = licenseUnitsConsumed;
        this.isBaseLicenseAvailable = isBaseLicenseAvailable;
        this.areAllOptionsAvailable = areAllOptionsAvailable;
        this.missingProducts = missingProducts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The display name of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The display name of the resource.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The resource product name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * The resource product name.
         * @param productName the value to set
         * @return this builder
         **/
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the resource.
         * @param resourceCompartmentId the value to set
         * @return this builder
         **/
        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }
        /**
         * The display name of the compartment that contains the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
        private String resourceCompartmentName;

        /**
         * The display name of the compartment that contains the resource.
         * @param resourceCompartmentName the value to set
         * @return this builder
         **/
        public Builder resourceCompartmentName(String resourceCompartmentName) {
            this.resourceCompartmentName = resourceCompartmentName;
            this.__explicitlySet__.add("resourceCompartmentName");
            return this;
        }
        /**
         * The unit type for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitType")
        private ResourceUnit resourceUnitType;

        /**
         * The unit type for the resource.
         * @param resourceUnitType the value to set
         * @return this builder
         **/
        public Builder resourceUnitType(ResourceUnit resourceUnitType) {
            this.resourceUnitType = resourceUnitType;
            this.__explicitlySet__.add("resourceUnitType");
            return this;
        }
        /**
         * Number of units of the resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitCount")
        private Double resourceUnitCount;

        /**
         * Number of units of the resource
         * @param resourceUnitCount the value to set
         * @return this builder
         **/
        public Builder resourceUnitCount(Double resourceUnitCount) {
            this.resourceUnitCount = resourceUnitCount;
            this.__explicitlySet__.add("resourceUnitCount");
            return this;
        }
        /**
         * The product license unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitType")
        private LicenseUnit licenseUnitType;

        /**
         * The product license unit.
         * @param licenseUnitType the value to set
         * @return this builder
         **/
        public Builder licenseUnitType(LicenseUnit licenseUnitType) {
            this.licenseUnitType = licenseUnitType;
            this.__explicitlySet__.add("licenseUnitType");
            return this;
        }
        /**
         * Number of license units consumed by the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitsConsumed")
        private Double licenseUnitsConsumed;

        /**
         * Number of license units consumed by the resource.
         * @param licenseUnitsConsumed the value to set
         * @return this builder
         **/
        public Builder licenseUnitsConsumed(Double licenseUnitsConsumed) {
            this.licenseUnitsConsumed = licenseUnitsConsumed;
            this.__explicitlySet__.add("licenseUnitsConsumed");
            return this;
        }
        /**
         * Specifies if the base license is available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBaseLicenseAvailable")
        private Boolean isBaseLicenseAvailable;

        /**
         * Specifies if the base license is available.
         * @param isBaseLicenseAvailable the value to set
         * @return this builder
         **/
        public Builder isBaseLicenseAvailable(Boolean isBaseLicenseAvailable) {
            this.isBaseLicenseAvailable = isBaseLicenseAvailable;
            this.__explicitlySet__.add("isBaseLicenseAvailable");
            return this;
        }
        /**
         * Specifies if all options are available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areAllOptionsAvailable")
        private Boolean areAllOptionsAvailable;

        /**
         * Specifies if all options are available.
         * @param areAllOptionsAvailable the value to set
         * @return this builder
         **/
        public Builder areAllOptionsAvailable(Boolean areAllOptionsAvailable) {
            this.areAllOptionsAvailable = areAllOptionsAvailable;
            this.__explicitlySet__.add("areAllOptionsAvailable");
            return this;
        }
        /**
         * Collection of missing product licenses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("missingProducts")
        private java.util.List<Product> missingProducts;

        /**
         * Collection of missing product licenses.
         * @param missingProducts the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The display name of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The display name of the resource.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The resource product name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * The resource product name.
     * @return the value
     **/
    public String getProductName() {
        return productName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the resource.
     * @return the value
     **/
    public String getResourceCompartmentId() {
        return resourceCompartmentId;
    }

    /**
     * The display name of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
    private final String resourceCompartmentName;

    /**
     * The display name of the compartment that contains the resource.
     * @return the value
     **/
    public String getResourceCompartmentName() {
        return resourceCompartmentName;
    }

    /**
     * The unit type for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitType")
    private final ResourceUnit resourceUnitType;

    /**
     * The unit type for the resource.
     * @return the value
     **/
    public ResourceUnit getResourceUnitType() {
        return resourceUnitType;
    }

    /**
     * Number of units of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceUnitCount")
    private final Double resourceUnitCount;

    /**
     * Number of units of the resource
     * @return the value
     **/
    public Double getResourceUnitCount() {
        return resourceUnitCount;
    }

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitType")
    private final LicenseUnit licenseUnitType;

    /**
     * The product license unit.
     * @return the value
     **/
    public LicenseUnit getLicenseUnitType() {
        return licenseUnitType;
    }

    /**
     * Number of license units consumed by the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnitsConsumed")
    private final Double licenseUnitsConsumed;

    /**
     * Number of license units consumed by the resource.
     * @return the value
     **/
    public Double getLicenseUnitsConsumed() {
        return licenseUnitsConsumed;
    }

    /**
     * Specifies if the base license is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseLicenseAvailable")
    private final Boolean isBaseLicenseAvailable;

    /**
     * Specifies if the base license is available.
     * @return the value
     **/
    public Boolean getIsBaseLicenseAvailable() {
        return isBaseLicenseAvailable;
    }

    /**
     * Specifies if all options are available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAllOptionsAvailable")
    private final Boolean areAllOptionsAvailable;

    /**
     * Specifies if all options are available.
     * @return the value
     **/
    public Boolean getAreAllOptionsAvailable() {
        return areAllOptionsAvailable;
    }

    /**
     * Collection of missing product licenses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("missingProducts")
    private final java.util.List<Product> missingProducts;

    /**
     * Collection of missing product licenses.
     * @return the value
     **/
    public java.util.List<Product> getMissingProducts() {
        return missingProducts;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProductLicenseConsumerSummary(");
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", resourceCompartmentName=")
                .append(String.valueOf(this.resourceCompartmentName));
        sb.append(", resourceUnitType=").append(String.valueOf(this.resourceUnitType));
        sb.append(", resourceUnitCount=").append(String.valueOf(this.resourceUnitCount));
        sb.append(", licenseUnitType=").append(String.valueOf(this.licenseUnitType));
        sb.append(", licenseUnitsConsumed=").append(String.valueOf(this.licenseUnitsConsumed));
        sb.append(", isBaseLicenseAvailable=").append(String.valueOf(this.isBaseLicenseAvailable));
        sb.append(", areAllOptionsAvailable=").append(String.valueOf(this.areAllOptionsAvailable));
        sb.append(", missingProducts=").append(String.valueOf(this.missingProducts));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductLicenseConsumerSummary)) {
            return false;
        }

        ProductLicenseConsumerSummary other = (ProductLicenseConsumerSummary) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(
                        this.resourceCompartmentName, other.resourceCompartmentName)
                && java.util.Objects.equals(this.resourceUnitType, other.resourceUnitType)
                && java.util.Objects.equals(this.resourceUnitCount, other.resourceUnitCount)
                && java.util.Objects.equals(this.licenseUnitType, other.licenseUnitType)
                && java.util.Objects.equals(this.licenseUnitsConsumed, other.licenseUnitsConsumed)
                && java.util.Objects.equals(
                        this.isBaseLicenseAvailable, other.isBaseLicenseAvailable)
                && java.util.Objects.equals(
                        this.areAllOptionsAvailable, other.areAllOptionsAvailable)
                && java.util.Objects.equals(this.missingProducts, other.missingProducts)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentName == null
                                ? 43
                                : this.resourceCompartmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceUnitType == null ? 43 : this.resourceUnitType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceUnitCount == null ? 43 : this.resourceUnitCount.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseUnitType == null ? 43 : this.licenseUnitType.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseUnitsConsumed == null
                                ? 43
                                : this.licenseUnitsConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.isBaseLicenseAvailable == null
                                ? 43
                                : this.isBaseLicenseAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.areAllOptionsAvailable == null
                                ? 43
                                : this.areAllOptionsAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.missingProducts == null ? 43 : this.missingProducts.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
