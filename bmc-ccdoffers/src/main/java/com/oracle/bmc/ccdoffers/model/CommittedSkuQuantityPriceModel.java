/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The committed SKU, quantity, and its price information model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CommittedSkuQuantityPriceModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CommittedSkuQuantityPriceModel
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sku",
        "skuDisplayName",
        "skuMetric",
        "isMainSku",
        "quantity",
        "currencyCodeLocalization"
    })
    public CommittedSkuQuantityPriceModel(
            String sku,
            String skuDisplayName,
            String skuMetric,
            Boolean isMainSku,
            Long quantity,
            java.util.List<CurrencyCodeLocalization> currencyCodeLocalization) {
        super();
        this.sku = sku;
        this.skuDisplayName = skuDisplayName;
        this.skuMetric = skuMetric;
        this.isMainSku = isMainSku;
        this.quantity = quantity;
        this.currencyCodeLocalization = currencyCodeLocalization;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The SKU part number (prefaced with "B") associated with the committed CCD. */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * The SKU part number (prefaced with "B") associated with the committed CCD.
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /** The canonical SKU display name derived from the associated offer. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
        private String skuDisplayName;

        /**
         * The canonical SKU display name derived from the associated offer.
         *
         * @param skuDisplayName the value to set
         * @return this builder
         */
        public Builder skuDisplayName(String skuDisplayName) {
            this.skuDisplayName = skuDisplayName;
            this.__explicitlySet__.add("skuDisplayName");
            return this;
        }
        /** The canonical billing metric derived from the associated offer. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
        private String skuMetric;

        /**
         * The canonical billing metric derived from the associated offer.
         *
         * @param skuMetric the value to set
         * @return this builder
         */
        public Builder skuMetric(String skuMetric) {
            this.skuMetric = skuMetric;
            this.__explicitlySet__.add("skuMetric");
            return this;
        }
        /** True if the SKU is the primary SKU of a CCD offer, otheriwse, false. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMainSku")
        private Boolean isMainSku;

        /**
         * True if the SKU is the primary SKU of a CCD offer, otheriwse, false.
         *
         * @param isMainSku the value to set
         * @return this builder
         */
        public Builder isMainSku(Boolean isMainSku) {
            this.isMainSku = isMainSku;
            this.__explicitlySet__.add("isMainSku");
            return this;
        }
        /** The SKU quantity that's getting committed. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Long quantity;

        /**
         * The SKU quantity that's getting committed.
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /** The pricing model associated with the currency code. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCodeLocalization")
        private java.util.List<CurrencyCodeLocalization> currencyCodeLocalization;

        /**
         * The pricing model associated with the currency code.
         *
         * @param currencyCodeLocalization the value to set
         * @return this builder
         */
        public Builder currencyCodeLocalization(
                java.util.List<CurrencyCodeLocalization> currencyCodeLocalization) {
            this.currencyCodeLocalization = currencyCodeLocalization;
            this.__explicitlySet__.add("currencyCodeLocalization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommittedSkuQuantityPriceModel build() {
            CommittedSkuQuantityPriceModel model =
                    new CommittedSkuQuantityPriceModel(
                            this.sku,
                            this.skuDisplayName,
                            this.skuMetric,
                            this.isMainSku,
                            this.quantity,
                            this.currencyCodeLocalization);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommittedSkuQuantityPriceModel model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("skuDisplayName")) {
                this.skuDisplayName(model.getSkuDisplayName());
            }
            if (model.wasPropertyExplicitlySet("skuMetric")) {
                this.skuMetric(model.getSkuMetric());
            }
            if (model.wasPropertyExplicitlySet("isMainSku")) {
                this.isMainSku(model.getIsMainSku());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("currencyCodeLocalization")) {
                this.currencyCodeLocalization(model.getCurrencyCodeLocalization());
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

    /** The SKU part number (prefaced with "B") associated with the committed CCD. */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * The SKU part number (prefaced with "B") associated with the committed CCD.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /** The canonical SKU display name derived from the associated offer. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
    private final String skuDisplayName;

    /**
     * The canonical SKU display name derived from the associated offer.
     *
     * @return the value
     */
    public String getSkuDisplayName() {
        return skuDisplayName;
    }

    /** The canonical billing metric derived from the associated offer. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
    private final String skuMetric;

    /**
     * The canonical billing metric derived from the associated offer.
     *
     * @return the value
     */
    public String getSkuMetric() {
        return skuMetric;
    }

    /** True if the SKU is the primary SKU of a CCD offer, otheriwse, false. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMainSku")
    private final Boolean isMainSku;

    /**
     * True if the SKU is the primary SKU of a CCD offer, otheriwse, false.
     *
     * @return the value
     */
    public Boolean getIsMainSku() {
        return isMainSku;
    }

    /** The SKU quantity that's getting committed. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Long quantity;

    /**
     * The SKU quantity that's getting committed.
     *
     * @return the value
     */
    public Long getQuantity() {
        return quantity;
    }

    /** The pricing model associated with the currency code. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCodeLocalization")
    private final java.util.List<CurrencyCodeLocalization> currencyCodeLocalization;

    /**
     * The pricing model associated with the currency code.
     *
     * @return the value
     */
    public java.util.List<CurrencyCodeLocalization> getCurrencyCodeLocalization() {
        return currencyCodeLocalization;
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
        sb.append("CommittedSkuQuantityPriceModel(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", skuDisplayName=").append(String.valueOf(this.skuDisplayName));
        sb.append(", skuMetric=").append(String.valueOf(this.skuMetric));
        sb.append(", isMainSku=").append(String.valueOf(this.isMainSku));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", currencyCodeLocalization=")
                .append(String.valueOf(this.currencyCodeLocalization));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommittedSkuQuantityPriceModel)) {
            return false;
        }

        CommittedSkuQuantityPriceModel other = (CommittedSkuQuantityPriceModel) o;
        return java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.skuDisplayName, other.skuDisplayName)
                && java.util.Objects.equals(this.skuMetric, other.skuMetric)
                && java.util.Objects.equals(this.isMainSku, other.isMainSku)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(
                        this.currencyCodeLocalization, other.currencyCodeLocalization)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result =
                (result * PRIME)
                        + (this.skuDisplayName == null ? 43 : this.skuDisplayName.hashCode());
        result = (result * PRIME) + (this.skuMetric == null ? 43 : this.skuMetric.hashCode());
        result = (result * PRIME) + (this.isMainSku == null ? 43 : this.isMainSku.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result =
                (result * PRIME)
                        + (this.currencyCodeLocalization == null
                                ? 43
                                : this.currencyCodeLocalization.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
