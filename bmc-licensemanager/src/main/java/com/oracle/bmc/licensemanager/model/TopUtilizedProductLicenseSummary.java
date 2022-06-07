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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopUtilizedProductLicenseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopUtilizedProductLicenseSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "productLicenseId",
        "productType",
        "unitType",
        "totalUnitsConsumed",
        "totalLicenseUnitCount",
        "isUnlimited",
        "status"
    })
    public TopUtilizedProductLicenseSummary(
            String productLicenseId,
            String productType,
            LicenseUnit unitType,
            Double totalUnitsConsumed,
            Integer totalLicenseUnitCount,
            Boolean isUnlimited,
            Status status) {
        super();
        this.productLicenseId = productLicenseId;
        this.productType = productType;
        this.unitType = unitType;
        this.totalUnitsConsumed = totalUnitsConsumed;
        this.totalLicenseUnitCount = totalLicenseUnitCount;
        this.isUnlimited = isUnlimited;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
    private final String productLicenseId;

    public String getProductLicenseId() {
        return productLicenseId;
    }

    /**
     * The product type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    private final String productType;

    public String getProductType() {
        return productType;
    }

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final LicenseUnit unitType;

    public LicenseUnit getUnitType() {
        return unitType;
    }

    /**
     * Number of license units consumed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnitsConsumed")
    private final Double totalUnitsConsumed;

    public Double getTotalUnitsConsumed() {
        return totalUnitsConsumed;
    }

    /**
     * Total number of license units in the product license provided by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitCount")
    private final Integer totalLicenseUnitCount;

    public Integer getTotalLicenseUnitCount() {
        return totalLicenseUnitCount;
    }

    /**
     * Specifies if the license unit count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /**
     * The current product license status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopUtilizedProductLicenseSummary(");
        sb.append("productLicenseId=").append(String.valueOf(this.productLicenseId));
        sb.append(", productType=").append(String.valueOf(this.productType));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append(", totalUnitsConsumed=").append(String.valueOf(this.totalUnitsConsumed));
        sb.append(", totalLicenseUnitCount=").append(String.valueOf(this.totalLicenseUnitCount));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopUtilizedProductLicenseSummary)) {
            return false;
        }

        TopUtilizedProductLicenseSummary other = (TopUtilizedProductLicenseSummary) o;
        return java.util.Objects.equals(this.productLicenseId, other.productLicenseId)
                && java.util.Objects.equals(this.productType, other.productType)
                && java.util.Objects.equals(this.unitType, other.unitType)
                && java.util.Objects.equals(this.totalUnitsConsumed, other.totalUnitsConsumed)
                && java.util.Objects.equals(this.totalLicenseUnitCount, other.totalLicenseUnitCount)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.productLicenseId == null ? 43 : this.productLicenseId.hashCode());
        result = (result * PRIME) + (this.productType == null ? 43 : this.productType.hashCode());
        result = (result * PRIME) + (this.unitType == null ? 43 : this.unitType.hashCode());
        result =
                (result * PRIME)
                        + (this.totalUnitsConsumed == null
                                ? 43
                                : this.totalUnitsConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalLicenseUnitCount == null
                                ? 43
                                : this.totalLicenseUnitCount.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
