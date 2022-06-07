/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Details for creating a new product license.
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
    builder = CreateProductLicenseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateProductLicenseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "isVendorOracle",
        "displayName",
        "licenseUnit",
        "vendorName",
        "images",
        "freeformTags",
        "definedTags"
    })
    public CreateProductLicenseDetails(
            String compartmentId,
            Boolean isVendorOracle,
            String displayName,
            LicenseUnit licenseUnit,
            String vendorName,
            java.util.List<ImageDetails> images,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.isVendorOracle = isVendorOracle;
        this.displayName = displayName;
        this.licenseUnit = licenseUnit;
        this.vendorName = vendorName;
        this.images = images;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
        private Boolean isVendorOracle;

        public Builder isVendorOracle(Boolean isVendorOracle) {
            this.isVendorOracle = isVendorOracle;
            this.__explicitlySet__.add("isVendorOracle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
        private LicenseUnit licenseUnit;

        public Builder licenseUnit(LicenseUnit licenseUnit) {
            this.licenseUnit = licenseUnit;
            this.__explicitlySet__.add("licenseUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<ImageDetails> images;

        public Builder images(java.util.List<ImageDetails> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateProductLicenseDetails build() {
            CreateProductLicenseDetails __instance__ =
                    new CreateProductLicenseDetails(
                            compartmentId,
                            isVendorOracle,
                            displayName,
                            licenseUnit,
                            vendorName,
                            images,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateProductLicenseDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .isVendorOracle(o.getIsVendorOracle())
                            .displayName(o.getDisplayName())
                            .licenseUnit(o.getLicenseUnit())
                            .vendorName(o.getVendorName())
                            .images(o.getImages())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where product licenses are created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Specifies if the product license vendor is Oracle or a third party.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
    private final Boolean isVendorOracle;

    public Boolean getIsVendorOracle() {
        return isVendorOracle;
    }

    /**
     * Name of the product license.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
    private final LicenseUnit licenseUnit;

    public LicenseUnit getLicenseUnit() {
        return licenseUnit;
    }

    /**
     * The product license vendor name, for example: Microsoft, RHEL, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final String vendorName;

    public String getVendorName() {
        return vendorName;
    }

    /**
     * The image details associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    private final java.util.List<ImageDetails> images;

    public java.util.List<ImageDetails> getImages() {
        return images;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateProductLicenseDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isVendorOracle=").append(String.valueOf(this.isVendorOracle));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseUnit=").append(String.valueOf(this.licenseUnit));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", images=").append(String.valueOf(this.images));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateProductLicenseDetails)) {
            return false;
        }

        CreateProductLicenseDetails other = (CreateProductLicenseDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isVendorOracle, other.isVendorOracle)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseUnit, other.licenseUnit)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.images, other.images)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isVendorOracle == null ? 43 : this.isVendorOracle.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseUnit == null ? 43 : this.licenseUnit.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.images == null ? 43 : this.images.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
