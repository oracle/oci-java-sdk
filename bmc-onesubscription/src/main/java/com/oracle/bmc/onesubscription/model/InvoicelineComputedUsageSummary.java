/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Computed Usage Summary object
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvoicelineComputedUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoicelineComputedUsageSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parentProduct",
        "product",
        "quantity",
        "netUnitPrice",
        "timeMeteredOn",
        "type",
        "cost",
        "costRounded"
    })
    public InvoicelineComputedUsageSummary(
            InvoicingProduct parentProduct,
            InvoicingProduct product,
            Double quantity,
            Double netUnitPrice,
            java.util.Date timeMeteredOn,
            Type type,
            Double cost,
            Double costRounded) {
        super();
        this.parentProduct = parentProduct;
        this.product = product;
        this.quantity = quantity;
        this.netUnitPrice = netUnitPrice;
        this.timeMeteredOn = timeMeteredOn;
        this.type = type;
        this.cost = cost;
        this.costRounded = costRounded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
        private InvoicingProduct parentProduct;

        public Builder parentProduct(InvoicingProduct parentProduct) {
            this.parentProduct = parentProduct;
            this.__explicitlySet__.add("parentProduct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private InvoicingProduct product;

        public Builder product(InvoicingProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Total Quantity that was used for computation
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Double quantity;

        /**
         * Total Quantity that was used for computation
         *
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(Double quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Net Unit Price for the product in consideration, price actual.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private Double netUnitPrice;

        /**
         * Net Unit Price for the product in consideration, price actual.
         *
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(Double netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Metered Service date.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
        private java.util.Date timeMeteredOn;

        /**
         * Metered Service date.
         *
         * @param timeMeteredOn the value to set
         * @return this builder
         **/
        public Builder timeMeteredOn(java.util.Date timeMeteredOn) {
            this.timeMeteredOn = timeMeteredOn;
            this.__explicitlySet__.add("timeMeteredOn");
            return this;
        }
        /**
         * Usage compute type in SPM.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Usage compute type in SPM.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Sum of Usage/Service Billing Line net Amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private Double cost;

        /**
         * Sum of Usage/Service Billing Line net Amount
         *
         * @param cost the value to set
         * @return this builder
         **/
        public Builder cost(Double cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }
        /**
         * Computed Line Amount rounded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
        private Double costRounded;

        /**
         * Computed Line Amount rounded.
         *
         * @param costRounded the value to set
         * @return this builder
         **/
        public Builder costRounded(Double costRounded) {
            this.costRounded = costRounded;
            this.__explicitlySet__.add("costRounded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicelineComputedUsageSummary build() {
            InvoicelineComputedUsageSummary __instance__ =
                    new InvoicelineComputedUsageSummary(
                            parentProduct,
                            product,
                            quantity,
                            netUnitPrice,
                            timeMeteredOn,
                            type,
                            cost,
                            costRounded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicelineComputedUsageSummary o) {
            Builder copiedBuilder =
                    parentProduct(o.getParentProduct())
                            .product(o.getProduct())
                            .quantity(o.getQuantity())
                            .netUnitPrice(o.getNetUnitPrice())
                            .timeMeteredOn(o.getTimeMeteredOn())
                            .type(o.getType())
                            .cost(o.getCost())
                            .costRounded(o.getCostRounded());

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

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    private final InvoicingProduct parentProduct;

    public InvoicingProduct getParentProduct() {
        return parentProduct;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final InvoicingProduct product;

    public InvoicingProduct getProduct() {
        return product;
    }

    /**
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Double quantity;

    /**
     * Total Quantity that was used for computation
     *
     * @return the value
     **/
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final Double netUnitPrice;

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     * @return the value
     **/
    public Double getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Metered Service date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    private final java.util.Date timeMeteredOn;

    /**
     * Metered Service date.
     *
     * @return the value
     **/
    public java.util.Date getTimeMeteredOn() {
        return timeMeteredOn;
    }

    /**
     * Usage compute type in SPM.
     *
     **/
    public enum Type {
        Promotion("PROMOTION"),
        DoNotBill("DO_NOT_BILL"),
        Usage("USAGE"),
        Commit("COMMIT"),
        Overage("OVERAGE"),
        PayAsYouGo("PAY_AS_YOU_GO"),
        MonthlyMinimum("MONTHLY_MINIMUM"),
        DelayedUsageInvoiceTiming("DELAYED_USAGE_INVOICE_TIMING"),
        DelayedUsageCommitmentExp("DELAYED_USAGE_COMMITMENT_EXP"),
        OnAccountCredit("ON_ACCOUNT_CREDIT"),
        ServiceCredit("SERVICE_CREDIT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Usage compute type in SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Usage compute type in SPM.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Sum of Usage/Service Billing Line net Amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final Double cost;

    /**
     * Sum of Usage/Service Billing Line net Amount
     *
     * @return the value
     **/
    public Double getCost() {
        return cost;
    }

    /**
     * Computed Line Amount rounded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
    private final Double costRounded;

    /**
     * Computed Line Amount rounded.
     *
     * @return the value
     **/
    public Double getCostRounded() {
        return costRounded;
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
        sb.append("InvoicelineComputedUsageSummary(");
        sb.append("parentProduct=").append(String.valueOf(this.parentProduct));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", timeMeteredOn=").append(String.valueOf(this.timeMeteredOn));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", costRounded=").append(String.valueOf(this.costRounded));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicelineComputedUsageSummary)) {
            return false;
        }

        InvoicelineComputedUsageSummary other = (InvoicelineComputedUsageSummary) o;
        return java.util.Objects.equals(this.parentProduct, other.parentProduct)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.timeMeteredOn, other.timeMeteredOn)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.costRounded, other.costRounded)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parentProduct == null ? 43 : this.parentProduct.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMeteredOn == null ? 43 : this.timeMeteredOn.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.costRounded == null ? 43 : this.costRounded.hashCode());
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
