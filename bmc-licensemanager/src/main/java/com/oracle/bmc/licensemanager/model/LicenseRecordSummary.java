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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LicenseRecordSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LicenseRecordSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "productLicenseId",
        "compartmentId",
        "displayName",
        "productId",
        "licenseCount",
        "expirationDate",
        "supportEndDate",
        "isUnlimited",
        "isPerpetual",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "licenseUnit",
        "productLicense",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public LicenseRecordSummary(
            String id,
            String productLicenseId,
            String compartmentId,
            String displayName,
            String productId,
            Integer licenseCount,
            java.util.Date expirationDate,
            java.util.Date supportEndDate,
            Boolean isUnlimited,
            Boolean isPerpetual,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifeCycleState lifecycleState,
            LicenseUnit licenseUnit,
            String productLicense,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.productLicenseId = productLicenseId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.productId = productId;
        this.licenseCount = licenseCount;
        this.expirationDate = expirationDate;
        this.supportEndDate = supportEndDate;
        this.isUnlimited = isUnlimited;
        this.isPerpetual = isPerpetual;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.licenseUnit = licenseUnit;
        this.productLicense = productLicense;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The license record [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which the license record is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
    private final String productLicenseId;

    public String getProductLicenseId() {
        return productLicenseId;
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the license record is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * License record display name. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The license record product ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    public String getProductId() {
        return productId;
    }

    /**
     * The number of license record units added by the user for the given license record.
     * Default 1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    private final Integer licenseCount;

    public Integer getLicenseCount() {
        return licenseCount;
    }

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    private final java.util.Date expirationDate;

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) format.
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
    private final java.util.Date supportEndDate;

    public java.util.Date getSupportEndDate() {
        return supportEndDate;
    }

    /**
     * Specifies if the license count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /**
     * Specifies if the license record term is perpertual.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
    private final Boolean isPerpetual;

    public Boolean getIsPerpetual() {
        return isPerpetual;
    }

    /**
     * The time the license record was created. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the license record was updated. An [RFC 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current license record state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifeCycleState lifecycleState;

    public LifeCycleState getLifecycleState() {
        return lifecycleState;
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
     * The product license name with which the license record is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productLicense")
    private final String productLicense;

    public String getProductLicense() {
        return productLicense;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LicenseRecordSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", productLicenseId=").append(String.valueOf(this.productLicenseId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", licenseCount=").append(String.valueOf(this.licenseCount));
        sb.append(", expirationDate=").append(String.valueOf(this.expirationDate));
        sb.append(", supportEndDate=").append(String.valueOf(this.supportEndDate));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", isPerpetual=").append(String.valueOf(this.isPerpetual));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", licenseUnit=").append(String.valueOf(this.licenseUnit));
        sb.append(", productLicense=").append(String.valueOf(this.productLicense));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LicenseRecordSummary)) {
            return false;
        }

        LicenseRecordSummary other = (LicenseRecordSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.productLicenseId, other.productLicenseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.licenseCount, other.licenseCount)
                && java.util.Objects.equals(this.expirationDate, other.expirationDate)
                && java.util.Objects.equals(this.supportEndDate, other.supportEndDate)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.isPerpetual, other.isPerpetual)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.licenseUnit, other.licenseUnit)
                && java.util.Objects.equals(this.productLicense, other.productLicense)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.productLicenseId == null ? 43 : this.productLicenseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.licenseCount == null ? 43 : this.licenseCount.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDate == null ? 43 : this.expirationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.supportEndDate == null ? 43 : this.supportEndDate.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.isPerpetual == null ? 43 : this.isPerpetual.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.licenseUnit == null ? 43 : this.licenseUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.productLicense == null ? 43 : this.productLicense.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
