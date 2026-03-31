/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Current monthly compute and storage costs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CurrentMonthlyCost.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CurrentMonthlyCost
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeAmount",
        "storageAmount",
        "currencyCode",
        "assetCount"
    })
    public CurrentMonthlyCost(
            java.math.BigDecimal computeAmount,
            java.math.BigDecimal storageAmount,
            String currencyCode,
            Integer assetCount) {
        super();
        this.computeAmount = computeAmount;
        this.storageAmount = storageAmount;
        this.currencyCode = currencyCode;
        this.assetCount = assetCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Current monthly compute costs. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAmount")
        private java.math.BigDecimal computeAmount;

        /**
         * Current monthly compute costs.
         *
         * @param computeAmount the value to set
         * @return this builder
         */
        public Builder computeAmount(java.math.BigDecimal computeAmount) {
            this.computeAmount = computeAmount;
            this.__explicitlySet__.add("computeAmount");
            return this;
        }
        /** Current monthly storage costs. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageAmount")
        private java.math.BigDecimal storageAmount;

        /**
         * Current monthly storage costs.
         *
         * @param storageAmount the value to set
         * @return this builder
         */
        public Builder storageAmount(java.math.BigDecimal storageAmount) {
            this.storageAmount = storageAmount;
            this.__explicitlySet__.add("storageAmount");
            return this;
        }
        /** Currency code as defined by ISO-4217. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code as defined by ISO-4217.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** Number of assets used in this calculation. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetCount")
        private Integer assetCount;

        /**
         * Number of assets used in this calculation.
         *
         * @param assetCount the value to set
         * @return this builder
         */
        public Builder assetCount(Integer assetCount) {
            this.assetCount = assetCount;
            this.__explicitlySet__.add("assetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CurrentMonthlyCost build() {
            CurrentMonthlyCost model =
                    new CurrentMonthlyCost(
                            this.computeAmount,
                            this.storageAmount,
                            this.currencyCode,
                            this.assetCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CurrentMonthlyCost model) {
            if (model.wasPropertyExplicitlySet("computeAmount")) {
                this.computeAmount(model.getComputeAmount());
            }
            if (model.wasPropertyExplicitlySet("storageAmount")) {
                this.storageAmount(model.getStorageAmount());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("assetCount")) {
                this.assetCount(model.getAssetCount());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Current monthly compute costs. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAmount")
    private final java.math.BigDecimal computeAmount;

    /**
     * Current monthly compute costs.
     *
     * @return the value
     */
    public java.math.BigDecimal getComputeAmount() {
        return computeAmount;
    }

    /** Current monthly storage costs. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageAmount")
    private final java.math.BigDecimal storageAmount;

    /**
     * Current monthly storage costs.
     *
     * @return the value
     */
    public java.math.BigDecimal getStorageAmount() {
        return storageAmount;
    }

    /** Currency code as defined by ISO-4217. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code as defined by ISO-4217.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** Number of assets used in this calculation. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetCount")
    private final Integer assetCount;

    /**
     * Number of assets used in this calculation.
     *
     * @return the value
     */
    public Integer getAssetCount() {
        return assetCount;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CurrentMonthlyCost(");
        sb.append("super=").append(super.toString());
        sb.append("computeAmount=").append(String.valueOf(this.computeAmount));
        sb.append(", storageAmount=").append(String.valueOf(this.storageAmount));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", assetCount=").append(String.valueOf(this.assetCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrentMonthlyCost)) {
            return false;
        }

        CurrentMonthlyCost other = (CurrentMonthlyCost) o;
        return java.util.Objects.equals(this.computeAmount, other.computeAmount)
                && java.util.Objects.equals(this.storageAmount, other.storageAmount)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.assetCount, other.assetCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.computeAmount == null ? 43 : this.computeAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageAmount == null ? 43 : this.storageAmount.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.assetCount == null ? 43 : this.assetCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
