/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The product license details.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProductLicense.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProductLicense {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalActiveLicenseUnitCount")
        private Integer totalActiveLicenseUnitCount;

        public Builder totalActiveLicenseUnitCount(Integer totalActiveLicenseUnitCount) {
            this.totalActiveLicenseUnitCount = totalActiveLicenseUnitCount;
            this.__explicitlySet__.add("totalActiveLicenseUnitCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifeCycleState lifecycleState;

        public Builder lifecycleState(LifeCycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitsConsumed")
        private Double totalLicenseUnitsConsumed;

        public Builder totalLicenseUnitsConsumed(Double totalLicenseUnitsConsumed) {
            this.totalLicenseUnitsConsumed = totalLicenseUnitsConsumed;
            this.__explicitlySet__.add("totalLicenseUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseRecordCount")
        private Integer totalLicenseRecordCount;

        public Builder totalLicenseRecordCount(Integer totalLicenseRecordCount) {
            this.totalLicenseRecordCount = totalLicenseRecordCount;
            this.__explicitlySet__.add("totalLicenseRecordCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activeLicenseRecordCount")
        private Integer activeLicenseRecordCount;

        public Builder activeLicenseRecordCount(Integer activeLicenseRecordCount) {
            this.activeLicenseRecordCount = activeLicenseRecordCount;
            this.__explicitlySet__.add("activeLicenseRecordCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
        private LicenseUnit licenseUnit;

        public Builder licenseUnit(LicenseUnit licenseUnit) {
            this.licenseUnit = licenseUnit;
            this.__explicitlySet__.add("licenseUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
        private Boolean isVendorOracle;

        public Builder isVendorOracle(Boolean isVendorOracle) {
            this.isVendorOracle = isVendorOracle;
            this.__explicitlySet__.add("isVendorOracle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOverSubscribed")
        private Boolean isOverSubscribed;

        public Builder isOverSubscribed(Boolean isOverSubscribed) {
            this.isOverSubscribed = isOverSubscribed;
            this.__explicitlySet__.add("isOverSubscribed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<ImageResponse> images;

        public Builder images(java.util.List<ImageResponse> images) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductLicense build() {
            ProductLicense __instance__ =
                    new ProductLicense(
                            id,
                            compartmentId,
                            status,
                            statusDescription,
                            totalActiveLicenseUnitCount,
                            lifecycleState,
                            totalLicenseUnitsConsumed,
                            totalLicenseRecordCount,
                            activeLicenseRecordCount,
                            licenseUnit,
                            isVendorOracle,
                            isOverSubscribed,
                            isUnlimited,
                            displayName,
                            vendorName,
                            timeCreated,
                            timeUpdated,
                            images,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductLicense o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .status(o.getStatus())
                            .statusDescription(o.getStatusDescription())
                            .totalActiveLicenseUnitCount(o.getTotalActiveLicenseUnitCount())
                            .lifecycleState(o.getLifecycleState())
                            .totalLicenseUnitsConsumed(o.getTotalLicenseUnitsConsumed())
                            .totalLicenseRecordCount(o.getTotalLicenseRecordCount())
                            .activeLicenseRecordCount(o.getActiveLicenseRecordCount())
                            .licenseUnit(o.getLicenseUnit())
                            .isVendorOracle(o.getIsVendorOracle())
                            .isOverSubscribed(o.getIsOverSubscribed())
                            .isUnlimited(o.getIsUnlimited())
                            .displayName(o.getDisplayName())
                            .vendorName(o.getVendorName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .images(o.getImages())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the product license is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The current product license status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * Status description for the current product license status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    String statusDescription;

    /**
     * The total number of licenses available for the product license, calculated by adding up all the license counts for active license records associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalActiveLicenseUnitCount")
    Integer totalActiveLicenseUnitCount;

    /**
     * The current product license state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifeCycleState lifecycleState;

    /**
     * The number of license units consumed. Updated after each allocation run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitsConsumed")
    Double totalLicenseUnitsConsumed;

    /**
     * The number of license records associated with the product license.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseRecordCount")
    Integer totalLicenseRecordCount;

    /**
     * The number of active license records associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeLicenseRecordCount")
    Integer activeLicenseRecordCount;

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
    LicenseUnit licenseUnit;

    /**
     * Specifies whether the vendor is Oracle or a third party.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
    Boolean isVendorOracle;

    /**
     * Specifies whether or not the product license is oversubscribed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverSubscribed")
    Boolean isOverSubscribed;

    /**
     * Specifies if the license unit count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    Boolean isUnlimited;

    /**
     * License record name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The vendor of the ProductLicense
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    String vendorName;

    /**
     * The time the product license was created. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the product license was updated. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The images associated with the product license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    java.util.List<ImageResponse> images;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
