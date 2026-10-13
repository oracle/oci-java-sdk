/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * A bundle SKU whose quantity is derived from the primary SKU quantity using a fixed ratio. <br>
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
        builder = FixedRatioBundleSku.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "quantityRule")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FixedRatioBundleSku extends BundleSku {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
        private String skuDisplayName;

        public Builder skuDisplayName(String skuDisplayName) {
            this.skuDisplayName = skuDisplayName;
            this.__explicitlySet__.add("skuDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
        private String skuMetric;

        public Builder skuMetric(String skuMetric) {
            this.skuMetric = skuMetric;
            this.__explicitlySet__.add("skuMetric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listPrice")
        private String listPrice;

        public Builder listPrice(String listPrice) {
            this.listPrice = listPrice;
            this.__explicitlySet__.add("listPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** The primary-to-bundled SKU quantity ratio. */
        @com.fasterxml.jackson.annotation.JsonProperty("ratio")
        private String ratio;

        /**
         * The primary-to-bundled SKU quantity ratio.
         *
         * @param ratio the value to set
         * @return this builder
         */
        public Builder ratio(String ratio) {
            this.ratio = ratio;
            this.__explicitlySet__.add("ratio");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedRatioBundleSku build() {
            FixedRatioBundleSku model =
                    new FixedRatioBundleSku(
                            this.sku,
                            this.skuDisplayName,
                            this.skuMetric,
                            this.listPrice,
                            this.currencyCode,
                            this.ratio);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedRatioBundleSku model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("skuDisplayName")) {
                this.skuDisplayName(model.getSkuDisplayName());
            }
            if (model.wasPropertyExplicitlySet("skuMetric")) {
                this.skuMetric(model.getSkuMetric());
            }
            if (model.wasPropertyExplicitlySet("listPrice")) {
                this.listPrice(model.getListPrice());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("ratio")) {
                this.ratio(model.getRatio());
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

    @Deprecated
    public FixedRatioBundleSku(
            String sku,
            String skuDisplayName,
            String skuMetric,
            String listPrice,
            String currencyCode,
            String ratio) {
        super(sku, skuDisplayName, skuMetric, listPrice, currencyCode);
        this.ratio = ratio;
    }

    /** The primary-to-bundled SKU quantity ratio. */
    @com.fasterxml.jackson.annotation.JsonProperty("ratio")
    private final String ratio;

    /**
     * The primary-to-bundled SKU quantity ratio.
     *
     * @return the value
     */
    public String getRatio() {
        return ratio;
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
        sb.append("FixedRatioBundleSku(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ratio=").append(String.valueOf(this.ratio));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedRatioBundleSku)) {
            return false;
        }

        FixedRatioBundleSku other = (FixedRatioBundleSku) o;
        return java.util.Objects.equals(this.ratio, other.ratio) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ratio == null ? 43 : this.ratio.hashCode());
        return result;
    }
}
