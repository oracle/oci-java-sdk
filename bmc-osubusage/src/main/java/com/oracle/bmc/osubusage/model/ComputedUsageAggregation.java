/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

/**
 * Computed Usage Aggregation object
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputedUsageAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputedUsageAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "quantity",
        "product",
        "dataCenter",
        "timeMeteredOn",
        "netUnitPrice",
        "costUnrounded",
        "cost",
        "type"
    })
    public ComputedUsageAggregation(
            String quantity,
            Product product,
            String dataCenter,
            java.util.Date timeMeteredOn,
            String netUnitPrice,
            String costUnrounded,
            String cost,
            Type type) {
        super();
        this.quantity = quantity;
        this.product = product;
        this.dataCenter = dataCenter;
        this.timeMeteredOn = timeMeteredOn;
        this.netUnitPrice = netUnitPrice;
        this.costUnrounded = costUnrounded;
        this.cost = cost;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total Quantity that was used for computation
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Total Quantity that was used for computation
         *
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Data Center Attribute as sent by MQS to SPM.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        /**
         * Data Center Attribute as sent by MQS to SPM.
         *
         * @param dataCenter the value to set
         * @return this builder
         **/
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }
        /**
         * Metered Service date , expressed in RFC 3339 timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
        private java.util.Date timeMeteredOn;

        /**
         * Metered Service date , expressed in RFC 3339 timestamp format.
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
         * Net Unit Price for the product in consideration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Net Unit Price for the product in consideration.
         *
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Sum of Computed Line Amount unrounded
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("costUnrounded")
        private String costUnrounded;

        /**
         * Sum of Computed Line Amount unrounded
         *
         * @param costUnrounded the value to set
         * @return this builder
         **/
        public Builder costUnrounded(String costUnrounded) {
            this.costUnrounded = costUnrounded;
            this.__explicitlySet__.add("costUnrounded");
            return this;
        }
        /**
         * Sum of Computed Line Amount rounded
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private String cost;

        /**
         * Sum of Computed Line Amount rounded
         *
         * @param cost the value to set
         * @return this builder
         **/
        public Builder cost(String cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageAggregation build() {
            ComputedUsageAggregation model =
                    new ComputedUsageAggregation(
                            this.quantity,
                            this.product,
                            this.dataCenter,
                            this.timeMeteredOn,
                            this.netUnitPrice,
                            this.costUnrounded,
                            this.cost,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageAggregation model) {
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("dataCenter")) {
                this.dataCenter(model.getDataCenter());
            }
            if (model.wasPropertyExplicitlySet("timeMeteredOn")) {
                this.timeMeteredOn(model.getTimeMeteredOn());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("costUnrounded")) {
                this.costUnrounded(model.getCostUnrounded());
            }
            if (model.wasPropertyExplicitlySet("cost")) {
                this.cost(model.getCost());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Total Quantity that was used for computation
     *
     * @return the value
     **/
    public String getQuantity() {
        return quantity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final Product product;

    public Product getProduct() {
        return product;
    }

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     * @return the value
     **/
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * Metered Service date , expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    private final java.util.Date timeMeteredOn;

    /**
     * Metered Service date , expressed in RFC 3339 timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeMeteredOn() {
        return timeMeteredOn;
    }

    /**
     * Net Unit Price for the product in consideration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Net Unit Price for the product in consideration.
     *
     * @return the value
     **/
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Sum of Computed Line Amount unrounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costUnrounded")
    private final String costUnrounded;

    /**
     * Sum of Computed Line Amount unrounded
     *
     * @return the value
     **/
    public String getCostUnrounded() {
        return costUnrounded;
    }

    /**
     * Sum of Computed Line Amount rounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final String cost;

    /**
     * Sum of Computed Line Amount rounded
     *
     * @return the value
     **/
    public String getCost() {
        return cost;
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
        CommitmentExpiration("COMMITMENT_EXPIRATION"),
        FundedAllocation("FUNDED_ALLOCATION"),
        DonotBillUsagePostTermination("DONOT_BILL_USAGE_POST_TERMINATION"),
        DelayedUsagePostTermination("DELAYED_USAGE_POST_TERMINATION"),

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
        sb.append("ComputedUsageAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("quantity=").append(String.valueOf(this.quantity));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(", timeMeteredOn=").append(String.valueOf(this.timeMeteredOn));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", costUnrounded=").append(String.valueOf(this.costUnrounded));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputedUsageAggregation)) {
            return false;
        }

        ComputedUsageAggregation other = (ComputedUsageAggregation) o;
        return java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && java.util.Objects.equals(this.timeMeteredOn, other.timeMeteredOn)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.costUnrounded, other.costUnrounded)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMeteredOn == null ? 43 : this.timeMeteredOn.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result =
                (result * PRIME)
                        + (this.costUnrounded == null ? 43 : this.costUnrounded.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
