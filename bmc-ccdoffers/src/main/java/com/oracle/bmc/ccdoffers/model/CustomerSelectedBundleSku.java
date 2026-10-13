/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * A bundle SKU whose quantity is selected by the customer within the configured range. For FLEX
 * offers, the maxQuantity should be equal to minQuantity if provided. <br>
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
        builder = CustomerSelectedBundleSku.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "quantityRule")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomerSelectedBundleSku extends BundleSku {
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
        /**
         * The minimum quantity the customer can select for this bundled SKU. For FLEX offers,
         * minQuantity and maxQuantity must be equal if maxQuantity provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minQuantity")
        private Long minQuantity;

        /**
         * The minimum quantity the customer can select for this bundled SKU. For FLEX offers,
         * minQuantity and maxQuantity must be equal if maxQuantity provided.
         *
         * @param minQuantity the value to set
         * @return this builder
         */
        public Builder minQuantity(Long minQuantity) {
            this.minQuantity = minQuantity;
            this.__explicitlySet__.add("minQuantity");
            return this;
        }
        /**
         * The maximum quantity the customer can select for this bundled SKU. For FLEX offers must
         * be equal to minQuantity if provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxQuantity")
        private Long maxQuantity;

        /**
         * The maximum quantity the customer can select for this bundled SKU. For FLEX offers must
         * be equal to minQuantity if provided.
         *
         * @param maxQuantity the value to set
         * @return this builder
         */
        public Builder maxQuantity(Long maxQuantity) {
            this.maxQuantity = maxQuantity;
            this.__explicitlySet__.add("maxQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomerSelectedBundleSku build() {
            CustomerSelectedBundleSku model =
                    new CustomerSelectedBundleSku(
                            this.sku,
                            this.skuDisplayName,
                            this.skuMetric,
                            this.listPrice,
                            this.currencyCode,
                            this.minQuantity,
                            this.maxQuantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomerSelectedBundleSku model) {
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
            if (model.wasPropertyExplicitlySet("minQuantity")) {
                this.minQuantity(model.getMinQuantity());
            }
            if (model.wasPropertyExplicitlySet("maxQuantity")) {
                this.maxQuantity(model.getMaxQuantity());
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
    public CustomerSelectedBundleSku(
            String sku,
            String skuDisplayName,
            String skuMetric,
            String listPrice,
            String currencyCode,
            Long minQuantity,
            Long maxQuantity) {
        super(sku, skuDisplayName, skuMetric, listPrice, currencyCode);
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
    }

    /**
     * The minimum quantity the customer can select for this bundled SKU. For FLEX offers,
     * minQuantity and maxQuantity must be equal if maxQuantity provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minQuantity")
    private final Long minQuantity;

    /**
     * The minimum quantity the customer can select for this bundled SKU. For FLEX offers,
     * minQuantity and maxQuantity must be equal if maxQuantity provided.
     *
     * @return the value
     */
    public Long getMinQuantity() {
        return minQuantity;
    }

    /**
     * The maximum quantity the customer can select for this bundled SKU. For FLEX offers must be
     * equal to minQuantity if provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxQuantity")
    private final Long maxQuantity;

    /**
     * The maximum quantity the customer can select for this bundled SKU. For FLEX offers must be
     * equal to minQuantity if provided.
     *
     * @return the value
     */
    public Long getMaxQuantity() {
        return maxQuantity;
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
        sb.append("CustomerSelectedBundleSku(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", minQuantity=").append(String.valueOf(this.minQuantity));
        sb.append(", maxQuantity=").append(String.valueOf(this.maxQuantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerSelectedBundleSku)) {
            return false;
        }

        CustomerSelectedBundleSku other = (CustomerSelectedBundleSku) o;
        return java.util.Objects.equals(this.minQuantity, other.minQuantity)
                && java.util.Objects.equals(this.maxQuantity, other.maxQuantity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.minQuantity == null ? 43 : this.minQuantity.hashCode());
        result = (result * PRIME) + (this.maxQuantity == null ? 43 : this.maxQuantity.hashCode());
        return result;
    }
}
