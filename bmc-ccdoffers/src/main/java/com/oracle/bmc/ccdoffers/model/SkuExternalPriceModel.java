/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The currency code and listing price. <br>
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
        builder = SkuExternalPriceModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SkuExternalPriceModel
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sku", "currencyCodeLocalization"})
    public SkuExternalPriceModel(
            String sku, java.util.List<CurrencyCodeLocalization> currencyCodeLocalization) {
        super();
        this.sku = sku;
        this.currencyCodeLocalization = currencyCodeLocalization;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The SKU part number (prefaced with "B") the CCD is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * The SKU part number (prefaced with "B") the CCD is associated with.
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
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

        public SkuExternalPriceModel build() {
            SkuExternalPriceModel model =
                    new SkuExternalPriceModel(this.sku, this.currencyCodeLocalization);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SkuExternalPriceModel model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
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

    /** The SKU part number (prefaced with "B") the CCD is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * The SKU part number (prefaced with "B") the CCD is associated with.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
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
        sb.append("SkuExternalPriceModel(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
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
        if (!(o instanceof SkuExternalPriceModel)) {
            return false;
        }

        SkuExternalPriceModel other = (SkuExternalPriceModel) o;
        return java.util.Objects.equals(this.sku, other.sku)
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
                        + (this.currencyCodeLocalization == null
                                ? 43
                                : this.currencyCodeLocalization.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
