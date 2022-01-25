/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputedUsageAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ComputedUsageAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

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

        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
        private java.util.Date timeMeteredOn;

        public Builder timeMeteredOn(java.util.Date timeMeteredOn) {
            this.timeMeteredOn = timeMeteredOn;
            this.__explicitlySet__.add("timeMeteredOn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("costUnrounded")
        private String costUnrounded;

        public Builder costUnrounded(String costUnrounded) {
            this.costUnrounded = costUnrounded;
            this.__explicitlySet__.add("costUnrounded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private String cost;

        public Builder cost(String cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageAggregation build() {
            ComputedUsageAggregation __instance__ =
                    new ComputedUsageAggregation(
                            quantity,
                            product,
                            dataCenter,
                            timeMeteredOn,
                            netUnitPrice,
                            costUnrounded,
                            cost,
                            type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageAggregation o) {
            Builder copiedBuilder =
                    quantity(o.getQuantity())
                            .product(o.getProduct())
                            .dataCenter(o.getDataCenter())
                            .timeMeteredOn(o.getTimeMeteredOn())
                            .netUnitPrice(o.getNetUnitPrice())
                            .costUnrounded(o.getCostUnrounded())
                            .cost(o.getCost())
                            .type(o.getType());

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

    /**
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    String quantity;

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    Product product;

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    String dataCenter;

    /**
     * Metered Service date , expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    java.util.Date timeMeteredOn;

    /**
     * Net Unit Price for the product in consideration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    String netUnitPrice;

    /**
     * Sum of Computed Line Amount unrounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costUnrounded")
    String costUnrounded;

    /**
     * Sum of Computed Line Amount rounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    String cost;
    /**
     * Usage compute type in SPM.
     *
     **/
    @lombok.extern.slf4j.Slf4j
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
    Type type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
