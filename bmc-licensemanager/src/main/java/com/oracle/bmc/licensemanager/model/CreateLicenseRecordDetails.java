/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The details about the new license record.
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
    builder = CreateLicenseRecordDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateLicenseRecordDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public CreateLicenseRecordDetails build() {
            CreateLicenseRecordDetails __instance__ =
                    new CreateLicenseRecordDetails(
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
        public Builder copy(CreateLicenseRecordDetails o) {
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

    /**
     * License record name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Specifies if the license record term is perpertual.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
    Boolean isPerpetual;

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    java.util.Date expirationDate;

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
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
     * The number of license units added by a user in a license record.
     * Default 1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    Integer licenseCount;

    /**
     * The license record product ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    String productId;

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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
