/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * A summary of the top utilized product licenses.
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
    builder = TopUtilizedProductLicenseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TopUtilizedProductLicenseSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
        private String productLicenseId;

        public Builder productLicenseId(String productLicenseId) {
            this.productLicenseId = productLicenseId;
            this.__explicitlySet__.add("productLicenseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productType")
        private String productType;

        public Builder productType(String productType) {
            this.productType = productType;
            this.__explicitlySet__.add("productType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private LicenseUnit unitType;

        public Builder unitType(LicenseUnit unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalUnitsConsumed")
        private Double totalUnitsConsumed;

        public Builder totalUnitsConsumed(Double totalUnitsConsumed) {
            this.totalUnitsConsumed = totalUnitsConsumed;
            this.__explicitlySet__.add("totalUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitCount")
        private Integer totalLicenseUnitCount;

        public Builder totalLicenseUnitCount(Integer totalLicenseUnitCount) {
            this.totalLicenseUnitCount = totalLicenseUnitCount;
            this.__explicitlySet__.add("totalLicenseUnitCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopUtilizedProductLicenseSummary build() {
            TopUtilizedProductLicenseSummary __instance__ =
                    new TopUtilizedProductLicenseSummary(
                            productLicenseId,
                            productType,
                            unitType,
                            totalUnitsConsumed,
                            totalLicenseUnitCount,
                            isUnlimited,
                            status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopUtilizedProductLicenseSummary o) {
            Builder copiedBuilder =
                    productLicenseId(o.getProductLicenseId())
                            .productType(o.getProductType())
                            .unitType(o.getUnitType())
                            .totalUnitsConsumed(o.getTotalUnitsConsumed())
                            .totalLicenseUnitCount(o.getTotalLicenseUnitCount())
                            .isUnlimited(o.getIsUnlimited())
                            .status(o.getStatus());

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
    @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
    String productLicenseId;

    /**
     * The product type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    String productType;

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    LicenseUnit unitType;

    /**
     * Number of license units consumed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnitsConsumed")
    Double totalUnitsConsumed;

    /**
     * Total number of license units in the product license provided by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitCount")
    Integer totalLicenseUnitCount;

    /**
     * Specifies if the license unit count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    Boolean isUnlimited;

    /**
     * The current product license status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
