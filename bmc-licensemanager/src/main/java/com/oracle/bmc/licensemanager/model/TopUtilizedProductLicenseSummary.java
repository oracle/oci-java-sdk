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
public final class TopUtilizedProductLicenseSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
        private String productLicenseId;

        /**
         * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param productLicenseId the value to set
         * @return this builder
         **/
        public Builder productLicenseId(String productLicenseId) {
            this.productLicenseId = productLicenseId;
            this.__explicitlySet__.add("productLicenseId");
            return this;
        }
        /**
         * The product type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productType")
        private String productType;

        /**
         * The product type.
         * @param productType the value to set
         * @return this builder
         **/
        public Builder productType(String productType) {
            this.productType = productType;
            this.__explicitlySet__.add("productType");
            return this;
        }
        /**
         * The product license unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private LicenseUnit unitType;

        /**
         * The product license unit.
         * @param unitType the value to set
         * @return this builder
         **/
        public Builder unitType(LicenseUnit unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }
        /**
         * Number of license units consumed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalUnitsConsumed")
        private Double totalUnitsConsumed;

        /**
         * Number of license units consumed.
         * @param totalUnitsConsumed the value to set
         * @return this builder
         **/
        public Builder totalUnitsConsumed(Double totalUnitsConsumed) {
            this.totalUnitsConsumed = totalUnitsConsumed;
            this.__explicitlySet__.add("totalUnitsConsumed");
            return this;
        }
        /**
         * Total number of license units in the product license provided by the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitCount")
        private Integer totalLicenseUnitCount;

        /**
         * Total number of license units in the product license provided by the user.
         * @param totalLicenseUnitCount the value to set
         * @return this builder
         **/
        public Builder totalLicenseUnitCount(Integer totalLicenseUnitCount) {
            this.totalLicenseUnitCount = totalLicenseUnitCount;
            this.__explicitlySet__.add("totalLicenseUnitCount");
            return this;
        }
        /**
         * Specifies if the license unit count is unlimited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        /**
         * Specifies if the license unit count is unlimited.
         * @param isUnlimited the value to set
         * @return this builder
         **/
        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }
        /**
         * The current product license status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current product license status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopUtilizedProductLicenseSummary build() {
            TopUtilizedProductLicenseSummary model =
                    new TopUtilizedProductLicenseSummary(
                            this.productLicenseId,
                            this.productType,
                            this.unitType,
                            this.totalUnitsConsumed,
                            this.totalLicenseUnitCount,
                            this.isUnlimited,
                            this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopUtilizedProductLicenseSummary model) {
            if (model.wasPropertyExplicitlySet("productLicenseId")) {
                this.productLicenseId(model.getProductLicenseId());
            }
            if (model.wasPropertyExplicitlySet("productType")) {
                this.productType(model.getProductType());
            }
            if (model.wasPropertyExplicitlySet("unitType")) {
                this.unitType(model.getUnitType());
            }
            if (model.wasPropertyExplicitlySet("totalUnitsConsumed")) {
                this.totalUnitsConsumed(model.getTotalUnitsConsumed());
            }
            if (model.wasPropertyExplicitlySet("totalLicenseUnitCount")) {
                this.totalLicenseUnitCount(model.getTotalLicenseUnitCount());
            }
            if (model.wasPropertyExplicitlySet("isUnlimited")) {
                this.isUnlimited(model.getIsUnlimited());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            return this;
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

    /**
     * The product license [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getProductLicenseId() {
        return productLicenseId;
    }

    /**
     * The product type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productType")
    private final String productType;

    /**
     * The product type.
     * @return the value
     **/
    public String getProductType() {
        return productType;
    }

    /**
     * The product license unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final LicenseUnit unitType;

    /**
     * The product license unit.
     * @return the value
     **/
    public LicenseUnit getUnitType() {
        return unitType;
    }

    /**
     * Number of license units consumed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnitsConsumed")
    private final Double totalUnitsConsumed;

    /**
     * Number of license units consumed.
     * @return the value
     **/
    public Double getTotalUnitsConsumed() {
        return totalUnitsConsumed;
    }

    /**
     * Total number of license units in the product license provided by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitCount")
    private final Integer totalLicenseUnitCount;

    /**
     * Total number of license units in the product license provided by the user.
     * @return the value
     **/
    public Integer getTotalLicenseUnitCount() {
        return totalLicenseUnitCount;
    }

    /**
     * Specifies if the license unit count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    /**
     * Specifies if the license unit count is unlimited.
     * @return the value
     **/
    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /**
     * The current product license status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current product license status.
     * @return the value
     **/
    public Status getStatus() {
        return status;
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
        sb.append("TopUtilizedProductLicenseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("productLicenseId=").append(String.valueOf(this.productLicenseId));
        sb.append(", productType=").append(String.valueOf(this.productType));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append(", totalUnitsConsumed=").append(String.valueOf(this.totalUnitsConsumed));
        sb.append(", totalLicenseUnitCount=").append(String.valueOf(this.totalLicenseUnitCount));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", status=").append(String.valueOf(this.status));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
