/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * A secondary SKU associated with a CCD commitment. Its quantity behavior is defined by the
 * corresponding bundled SKU on the CCD offer. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecondarySkus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecondarySkus extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sku", "skuDisplayName", "skuMetric", "quantity"})
    public SecondarySkus(String sku, String skuDisplayName, String skuMetric, Long quantity) {
        super();
        this.sku = sku;
        this.skuDisplayName = skuDisplayName;
        this.skuMetric = skuMetric;
        this.quantity = quantity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The secondary SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will
         * be the secondary SKU with the main "E4 OCPUs" SKU. Must also be the same as {@code
         * CcdOffers's} {@code bundleSkus} {@code sku} value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * The secondary SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will
         * be the secondary SKU with the main "E4 OCPUs" SKU. Must also be the same as {@code
         * CcdOffers's} {@code bundleSkus} {@code sku} value.
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /**
         * The canonical SKU display name derived from the associated offer. This property remains
         * accepted in create and update requests for compatibility, but CCD uses the offer-derived
         * value. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
        private String skuDisplayName;

        /**
         * The canonical SKU display name derived from the associated offer. This property remains
         * accepted in create and update requests for compatibility, but CCD uses the offer-derived
         * value. Avoid entering confidential information.
         *
         * @param skuDisplayName the value to set
         * @return this builder
         */
        public Builder skuDisplayName(String skuDisplayName) {
            this.skuDisplayName = skuDisplayName;
            this.__explicitlySet__.add("skuDisplayName");
            return this;
        }
        /**
         * The canonical billing metric derived from the associated offer. This property remains
         * accepted in create and update requests for compatibility, but CCD uses the offer-derived
         * value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
        private String skuMetric;

        /**
         * The canonical billing metric derived from the associated offer. This property remains
         * accepted in create and update requests for compatibility, but CCD uses the offer-derived
         * value.
         *
         * @param skuMetric the value to set
         * @return this builder
         */
        public Builder skuMetric(String skuMetric) {
            this.skuMetric = skuMetric;
            this.__explicitlySet__.add("skuMetric");
            return this;
        }
        /**
         * The resolved hourly commitment quantity for this secondary SKU. In create or update
         * requests, this property is required when the corresponding offer component uses {@code
         * CUSTOMER_SELECTED}, and the value must be within the offer component's minimum and
         * maximum. For FLEX offers with {@code CUSTOMER_SELECTED}, this quantity must equal the
         * offer component's {@code minQuantity} and, if defined, {@code maxQuantity}. For {@code
         * FIXED_RATIO}, this property may be omitted because CCD derives it from the primary
         * quantity and the offer-defined ratio. If an existing client supplies a quantity for
         * {@code FIXED_RATIO}, the offer-defined ratio is authoritative.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Long quantity;

        /**
         * The resolved hourly commitment quantity for this secondary SKU. In create or update
         * requests, this property is required when the corresponding offer component uses {@code
         * CUSTOMER_SELECTED}, and the value must be within the offer component's minimum and
         * maximum. For FLEX offers with {@code CUSTOMER_SELECTED}, this quantity must equal the
         * offer component's {@code minQuantity} and, if defined, {@code maxQuantity}. For {@code
         * FIXED_RATIO}, this property may be omitted because CCD derives it from the primary
         * quantity and the offer-defined ratio. If an existing client supplies a quantity for
         * {@code FIXED_RATIO}, the offer-defined ratio is authoritative.
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecondarySkus build() {
            SecondarySkus model =
                    new SecondarySkus(this.sku, this.skuDisplayName, this.skuMetric, this.quantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecondarySkus model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("skuDisplayName")) {
                this.skuDisplayName(model.getSkuDisplayName());
            }
            if (model.wasPropertyExplicitlySet("skuMetric")) {
                this.skuMetric(model.getSkuMetric());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
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

    /**
     * The secondary SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will be
     * the secondary SKU with the main "E4 OCPUs" SKU. Must also be the same as {@code CcdOffers's}
     * {@code bundleSkus} {@code sku} value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * The secondary SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will be
     * the secondary SKU with the main "E4 OCPUs" SKU. Must also be the same as {@code CcdOffers's}
     * {@code bundleSkus} {@code sku} value.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /**
     * The canonical SKU display name derived from the associated offer. This property remains
     * accepted in create and update requests for compatibility, but CCD uses the offer-derived
     * value. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
    private final String skuDisplayName;

    /**
     * The canonical SKU display name derived from the associated offer. This property remains
     * accepted in create and update requests for compatibility, but CCD uses the offer-derived
     * value. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getSkuDisplayName() {
        return skuDisplayName;
    }

    /**
     * The canonical billing metric derived from the associated offer. This property remains
     * accepted in create and update requests for compatibility, but CCD uses the offer-derived
     * value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
    private final String skuMetric;

    /**
     * The canonical billing metric derived from the associated offer. This property remains
     * accepted in create and update requests for compatibility, but CCD uses the offer-derived
     * value.
     *
     * @return the value
     */
    public String getSkuMetric() {
        return skuMetric;
    }

    /**
     * The resolved hourly commitment quantity for this secondary SKU. In create or update requests,
     * this property is required when the corresponding offer component uses {@code
     * CUSTOMER_SELECTED}, and the value must be within the offer component's minimum and maximum.
     * For FLEX offers with {@code CUSTOMER_SELECTED}, this quantity must equal the offer
     * component's {@code minQuantity} and, if defined, {@code maxQuantity}. For {@code
     * FIXED_RATIO}, this property may be omitted because CCD derives it from the primary quantity
     * and the offer-defined ratio. If an existing client supplies a quantity for {@code
     * FIXED_RATIO}, the offer-defined ratio is authoritative.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Long quantity;

    /**
     * The resolved hourly commitment quantity for this secondary SKU. In create or update requests,
     * this property is required when the corresponding offer component uses {@code
     * CUSTOMER_SELECTED}, and the value must be within the offer component's minimum and maximum.
     * For FLEX offers with {@code CUSTOMER_SELECTED}, this quantity must equal the offer
     * component's {@code minQuantity} and, if defined, {@code maxQuantity}. For {@code
     * FIXED_RATIO}, this property may be omitted because CCD derives it from the primary quantity
     * and the offer-defined ratio. If an existing client supplies a quantity for {@code
     * FIXED_RATIO}, the offer-defined ratio is authoritative.
     *
     * @return the value
     */
    public Long getQuantity() {
        return quantity;
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
        sb.append("SecondarySkus(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", skuDisplayName=").append(String.valueOf(this.skuDisplayName));
        sb.append(", skuMetric=").append(String.valueOf(this.skuMetric));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecondarySkus)) {
            return false;
        }

        SecondarySkus other = (SecondarySkus) o;
        return java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.skuDisplayName, other.skuDisplayName)
                && java.util.Objects.equals(this.skuMetric, other.skuMetric)
                && java.util.Objects.equals(this.quantity, other.quantity)
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
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
