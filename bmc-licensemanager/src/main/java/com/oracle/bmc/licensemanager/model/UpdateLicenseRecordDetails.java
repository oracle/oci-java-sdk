/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The details about updates in the license record.
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
    builder = UpdateLicenseRecordDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateLicenseRecordDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isPerpetual",
        "expirationDate",
        "supportEndDate",
        "isUnlimited",
        "licenseCount",
        "productId",
        "freeformTags",
        "definedTags"
    })
    public UpdateLicenseRecordDetails(
            String displayName,
            Boolean isPerpetual,
            java.util.Date expirationDate,
            java.util.Date supportEndDate,
            Boolean isUnlimited,
            Integer licenseCount,
            String productId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isPerpetual = isPerpetual;
        this.expirationDate = expirationDate;
        this.supportEndDate = supportEndDate;
        this.isUnlimited = isUnlimited;
        this.licenseCount = licenseCount;
        this.productId = productId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
        private Boolean isPerpetual;

        public Builder isPerpetual(Boolean isPerpetual) {
            this.isPerpetual = isPerpetual;
            this.__explicitlySet__.add("isPerpetual");
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

        @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
        private Integer licenseCount;

        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            this.__explicitlySet__.add("licenseCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
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

        public UpdateLicenseRecordDetails build() {
            UpdateLicenseRecordDetails __instance__ =
                    new UpdateLicenseRecordDetails(
                            displayName,
                            isPerpetual,
                            expirationDate,
                            supportEndDate,
                            isUnlimited,
                            licenseCount,
                            productId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLicenseRecordDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .isPerpetual(o.getIsPerpetual())
                            .expirationDate(o.getExpirationDate())
                            .supportEndDate(o.getSupportEndDate())
                            .isUnlimited(o.getIsUnlimited())
                            .licenseCount(o.getLicenseCount())
                            .productId(o.getProductId())
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
     * License record name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
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
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
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
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
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
     * The number of license units added by a user in a license record.
     * Default 1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    private final Integer licenseCount;

    public Integer getLicenseCount() {
        return licenseCount;
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
        sb.append("UpdateLicenseRecordDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPerpetual=").append(String.valueOf(this.isPerpetual));
        sb.append(", expirationDate=").append(String.valueOf(this.expirationDate));
        sb.append(", supportEndDate=").append(String.valueOf(this.supportEndDate));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", licenseCount=").append(String.valueOf(this.licenseCount));
        sb.append(", productId=").append(String.valueOf(this.productId));
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
        if (!(o instanceof UpdateLicenseRecordDetails)) {
            return false;
        }

        UpdateLicenseRecordDetails other = (UpdateLicenseRecordDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isPerpetual, other.isPerpetual)
                && java.util.Objects.equals(this.expirationDate, other.expirationDate)
                && java.util.Objects.equals(this.supportEndDate, other.supportEndDate)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.licenseCount, other.licenseCount)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isPerpetual == null ? 43 : this.isPerpetual.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDate == null ? 43 : this.expirationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.supportEndDate == null ? 43 : this.supportEndDate.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.licenseCount == null ? 43 : this.licenseCount.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
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
