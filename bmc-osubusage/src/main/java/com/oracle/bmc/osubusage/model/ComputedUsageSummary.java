/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputedUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ComputedUsageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
        private String parentSubscribedServiceId;

        public Builder parentSubscribedServiceId(String parentSubscribedServiceId) {
            this.parentSubscribedServiceId = parentSubscribedServiceId;
            this.__explicitlySet__.add("parentSubscribedServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
        private Product parentProduct;

        public Builder parentProduct(Product parentProduct) {
            this.parentProduct = parentProduct;
            this.__explicitlySet__.add("parentProduct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
        private String planNumber;

        public Builder planNumber(String planNumber) {
            this.planNumber = planNumber;
            this.__explicitlySet__.add("planNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
        private String rateCardTierdId;

        public Builder rateCardTierdId(String rateCardTierdId) {
            this.rateCardTierdId = rateCardTierdId;
            this.__explicitlySet__.add("rateCardTierdId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
        private String rateCardId;

        public Builder rateCardId(String rateCardId) {
            this.rateCardId = rateCardId;
            this.__explicitlySet__.add("rateCardId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
        private String computeSource;

        public Builder computeSource(String computeSource) {
            this.computeSource = computeSource;
            this.__explicitlySet__.add("computeSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
        private String mqsMessageId;

        public Builder mqsMessageId(String mqsMessageId) {
            this.mqsMessageId = mqsMessageId;
            this.__explicitlySet__.add("mqsMessageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
        private String computedUsageId;

        public Builder computedUsageId(String computedUsageId) {
            this.computedUsageId = computedUsageId;
            this.__explicitlySet__.add("computedUsageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
        private String usageNumber;

        public Builder usageNumber(String usageNumber) {
            this.usageNumber = usageNumber;
            this.__explicitlySet__.add("usageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
        private String originalUsageNumber;

        public Builder originalUsageNumber(String originalUsageNumber) {
            this.originalUsageNumber = originalUsageNumber;
            this.__explicitlySet__.add("originalUsageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
        private String commitmentServiceId;

        public Builder commitmentServiceId(String commitmentServiceId) {
            this.commitmentServiceId = commitmentServiceId;
            this.__explicitlySet__.add("commitmentServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
        private Boolean isInvoiced;

        public Builder isInvoiced(Boolean isInvoiced) {
            this.isInvoiced = isInvoiced;
            this.__explicitlySet__.add("isInvoiced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
        private java.util.Date timeOfArrival;

        public Builder timeOfArrival(java.util.Date timeOfArrival) {
            this.timeOfArrival = timeOfArrival;
            this.__explicitlySet__.add("timeOfArrival");
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

        @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
        private String costRounded;

        public Builder costRounded(String costRounded) {
            this.costRounded = costRounded;
            this.__explicitlySet__.add("costRounded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private String cost;

        public Builder cost(String cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageSummary build() {
            ComputedUsageSummary __instance__ =
                    new ComputedUsageSummary(
                            timeCreated,
                            timeUpdated,
                            parentSubscribedServiceId,
                            parentProduct,
                            planNumber,
                            currencyCode,
                            rateCardTierdId,
                            rateCardId,
                            computeSource,
                            dataCenter,
                            mqsMessageId,
                            computedUsageId,
                            quantity,
                            usageNumber,
                            originalUsageNumber,
                            commitmentServiceId,
                            isInvoiced,
                            type,
                            timeOfArrival,
                            timeMeteredOn,
                            netUnitPrice,
                            costRounded,
                            cost,
                            product,
                            unitOfMeasure);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageSummary o) {
            Builder copiedBuilder =
                    timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .parentSubscribedServiceId(o.getParentSubscribedServiceId())
                            .parentProduct(o.getParentProduct())
                            .planNumber(o.getPlanNumber())
                            .currencyCode(o.getCurrencyCode())
                            .rateCardTierdId(o.getRateCardTierdId())
                            .rateCardId(o.getRateCardId())
                            .computeSource(o.getComputeSource())
                            .dataCenter(o.getDataCenter())
                            .mqsMessageId(o.getMqsMessageId())
                            .computedUsageId(o.getComputedUsageId())
                            .quantity(o.getQuantity())
                            .usageNumber(o.getUsageNumber())
                            .originalUsageNumber(o.getOriginalUsageNumber())
                            .commitmentServiceId(o.getCommitmentServiceId())
                            .isInvoiced(o.getIsInvoiced())
                            .type(o.getType())
                            .timeOfArrival(o.getTimeOfArrival())
                            .timeMeteredOn(o.getTimeMeteredOn())
                            .netUnitPrice(o.getNetUnitPrice())
                            .costRounded(o.getCostRounded())
                            .cost(o.getCost())
                            .product(o.getProduct())
                            .unitOfMeasure(o.getUnitOfMeasure());

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
     * Computed Usage created time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Computed Usage updated time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Subscribed service line parent id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
    String parentSubscribedServiceId;

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    Product parentProduct;

    /**
     * Subscription plan number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
    String planNumber;

    /**
     * Currency code
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    String currencyCode;

    /**
     * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
    String rateCardTierdId;

    /**
     * Ratecard Id at subscribed service level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
    String rateCardId;

    /**
     * SPM Internal compute records source .
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
    String computeSource;

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    String dataCenter;

    /**
     * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
    String mqsMessageId;

    /**
     * SPM Internal computed usage Id , 32 character string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
    String computedUsageId;

    /**
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    String quantity;

    /**
     * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
    String usageNumber;

    /**
     * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
    String originalUsageNumber;

    /**
     * Subscribed service commitmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
    String commitmentServiceId;

    /**
     * Invoicing status for the aggregated compute usage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
    Boolean isInvoiced;
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

    /**
     * Usae computation date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
    java.util.Date timeOfArrival;

    /**
     * Metered Service date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    java.util.Date timeMeteredOn;

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    String netUnitPrice;

    /**
     * Computed Line Amount rounded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
    String costRounded;

    /**
     * Computed Line Amount not rounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    String cost;

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    Product product;

    /**
     * Unit of Messure
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    String unitOfMeasure;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
