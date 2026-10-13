/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * A polymorphic bundle SKU. The {@code quantityRule} discriminator identifies how the quantity for
 * this bundled SKU is determined. Every bundled SKU in an offer must use the same {@code
 * quantityRule}; don't mix {@code FIXED_RATIO} and {@code CUSTOMER_SELECTED} bundled SKUs in one
 * offer. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "quantityRule",
        defaultImpl = BundleSku.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FixedRatioBundleSku.class,
            name = "FIXED_RATIO"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CustomerSelectedBundleSku.class,
            name = "CUSTOMER_SELECTED")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BundleSku extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sku",
        "skuDisplayName",
        "skuMetric",
        "listPrice",
        "currencyCode"
    })
    protected BundleSku(
            String sku,
            String skuDisplayName,
            String skuMetric,
            String listPrice,
            String currencyCode) {
        super();
        this.sku = sku;
        this.skuDisplayName = skuDisplayName;
        this.skuMetric = skuMetric;
        this.listPrice = listPrice;
        this.currencyCode = currencyCode;
    }

    /**
     * The bundled SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will be
     * bundled with the main "E4 OCPUs" SKU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * The bundled SKU part number (prefaced with "B"). For example, the "E4 MEMORY" SKU will be
     * bundled with the main "E4 OCPUs" SKU.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /**
     * The SKU display name is derived by CCD. If CCD cannot derive a unique value, it uses the
     * caller-provided value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
    private final String skuDisplayName;

    /**
     * The SKU display name is derived by CCD. If CCD cannot derive a unique value, it uses the
     * caller-provided value.
     *
     * @return the value
     */
    public String getSkuDisplayName() {
        return skuDisplayName;
    }

    /**
     * The SKU billing metric is derived by CCD. If CCD cannot derive a unique value, it uses the
     * caller-provided value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
    private final String skuMetric;

    /**
     * The SKU billing metric is derived by CCD. If CCD cannot derive a unique value, it uses the
     * caller-provided value.
     *
     * @return the value
     */
    public String getSkuMetric() {
        return skuMetric;
    }

    /**
     * List price of a SKU. Only set this property if the product or SKU is private. Tier pricing
     * SKUs aren't supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listPrice")
    private final String listPrice;

    /**
     * List price of a SKU. Only set this property if the product or SKU is private. Tier pricing
     * SKUs aren't supported.
     *
     * @return the value
     */
    public String getListPrice() {
        return listPrice;
    }

    /**
     * The currency code of {@code listPrice} associated with the product or SKU. Only set this
     * property if the product or SKU is private. Tier pricing SKUs aren't supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * The currency code of {@code listPrice} associated with the product or SKU. Only set this
     * property if the product or SKU is private. Tier pricing SKUs aren't supported.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
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
        sb.append("BundleSku(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", skuDisplayName=").append(String.valueOf(this.skuDisplayName));
        sb.append(", skuMetric=").append(String.valueOf(this.skuMetric));
        sb.append(", listPrice=").append(String.valueOf(this.listPrice));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundleSku)) {
            return false;
        }

        BundleSku other = (BundleSku) o;
        return java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.skuDisplayName, other.skuDisplayName)
                && java.util.Objects.equals(this.skuMetric, other.skuMetric)
                && java.util.Objects.equals(this.listPrice, other.listPrice)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
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
        result = (result * PRIME) + (this.listPrice == null ? 43 : this.listPrice.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Determines how CCD resolves the bundled SKU quantity. {@code FIXED_RATIO} quantities are
     * derived from the primary quantity using {@code ratio}. {@code CUSTOMER_SELECTED} quantities
     * are provided by the customer within the configured minimum and maximum.
     */
    public enum QuantityRule implements com.oracle.bmc.http.internal.BmcEnum {
        FixedRatio("FIXED_RATIO"),
        CustomerSelected("CUSTOMER_SELECTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(QuantityRule.class);

        private final String value;
        private static java.util.Map<String, QuantityRule> map;

        static {
            map = new java.util.HashMap<>();
            for (QuantityRule v : QuantityRule.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        QuantityRule(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QuantityRule create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'QuantityRule', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
