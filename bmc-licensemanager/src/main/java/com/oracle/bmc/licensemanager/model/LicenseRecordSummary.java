/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The license record summary.
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
    builder = LicenseRecordSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LicenseRecordSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
        private String productLicenseId;

        public Builder productLicenseId(String productLicenseId) {
            this.productLicenseId = productLicenseId;
            this.__explicitlySet__.add("productLicenseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
        private Integer licenseCount;

        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            this.__explicitlySet__.add("licenseCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
        private java.util.Date expirationDate;

        public Builder expirationDate(java.util.Date expirationDate) {
            this.expirationDate = expirationDate;
            this.__explicitlySet__.add("expirationDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
        private java.util.Date supportEndDate;

        public Builder supportEndDate(java.util.Date supportEndDate) {
            this.supportEndDate = supportEndDate;
            this.__explicitlySet__.add("supportEndDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
        private Boolean isPerpetual;

        public Builder isPerpetual(Boolean isPerpetual) {
            this.isPerpetual = isPerpetual;
            this.__explicitlySet__.add("isPerpetual");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifeCycleState lifecycleState;

        public Builder lifecycleState(LifeCycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
        private LicenseUnit licenseUnit;

        public Builder licenseUnit(LicenseUnit licenseUnit) {
            this.licenseUnit = licenseUnit;
            this.__explicitlySet__.add("licenseUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productLicense")
        private String productLicense;

        public Builder productLicense(String productLicense) {
            this.productLicense = productLicense;
            this.__explicitlySet__.add("productLicense");
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

        public LicenseRecordSummary build() {
            LicenseRecordSummary __instance__ =
                    new LicenseRecordSummary(
                            id,
                            productLicenseId,
                            compartmentId,
                            displayName,
                            productId,
                            licenseCount,
                            expirationDate,
                            supportEndDate,
                            isUnlimited,
                            isPerpetual,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            licenseUnit,
                            productLicense,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LicenseRecordSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .productLicenseId(o.getProductLicenseId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .productId(o.getProductId())
                            .licenseCount(o.getLicenseCount())
                            .expirationDate(o.getExpirationDate())
                            .supportEndDate(o.getSupportEndDate())
                            .isUnlimited(o.getIsUnlimited())
                            .isPerpetual(o.getIsPerpetual())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .licenseUnit(o.getLicenseUnit())
                            .productLicense(o.getProductLicense())
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
     * The license record [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which the license record is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
    String productLicenseId;

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the license record is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * License record display name. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The license record product ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    String productId;

    /**
     * The number of license record units added by the user for the given license record.
     * Default 1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    Integer licenseCount;

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    java.util.Date expirationDate;

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
    java.util.Date supportEndDate;

    /**
     * Specifies if the license count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    Boolean isUnlimited;

    /**
     * Specifies if the license record term is perpertual.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
    Boolean isPerpetual;

    /**
     * The time the license record was created. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the license record was updated. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current license record state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifeCycleState lifecycleState;

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
    LicenseUnit licenseUnit;

    /**
     * The product license name with which the license record is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productLicense")
    String productLicense;

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
