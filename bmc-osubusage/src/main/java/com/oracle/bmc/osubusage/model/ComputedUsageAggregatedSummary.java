/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

/**
 * Subscribed Service Contract details
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
    builder = ComputedUsageAggregatedSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ComputedUsageAggregatedSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
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

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
        private String rateCardId;

        public Builder rateCardId(String rateCardId) {
            this.rateCardId = rateCardId;
            this.__explicitlySet__.add("rateCardId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
        private PricingModel pricingModel;

        public Builder pricingModel(PricingModel pricingModel) {
            this.pricingModel = pricingModel;
            this.__explicitlySet__.add("pricingModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedComputedUsages")
        private java.util.List<ComputedUsageAggregation> aggregatedComputedUsages;

        public Builder aggregatedComputedUsages(
                java.util.List<ComputedUsageAggregation> aggregatedComputedUsages) {
            this.aggregatedComputedUsages = aggregatedComputedUsages;
            this.__explicitlySet__.add("aggregatedComputedUsages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageAggregatedSummary build() {
            ComputedUsageAggregatedSummary __instance__ =
                    new ComputedUsageAggregatedSummary(
                            subscriptionId,
                            parentSubscribedServiceId,
                            parentProduct,
                            timeStart,
                            timeEnd,
                            planNumber,
                            currencyCode,
                            rateCardId,
                            pricingModel,
                            aggregatedComputedUsages);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageAggregatedSummary o) {
            Builder copiedBuilder =
                    subscriptionId(o.getSubscriptionId())
                            .parentSubscribedServiceId(o.getParentSubscribedServiceId())
                            .parentProduct(o.getParentProduct())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .planNumber(o.getPlanNumber())
                            .currencyCode(o.getCurrencyCode())
                            .rateCardId(o.getRateCardId())
                            .pricingModel(o.getPricingModel())
                            .aggregatedComputedUsages(o.getAggregatedComputedUsages());

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
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage in SPM
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    String subscriptionId;

    /**
     * Subscribed service line parent id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
    String parentSubscribedServiceId;

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    Product parentProduct;

    /**
     * Subscribed services contract line start date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Subscribed services contract line end date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * Subscribed service asociated subscription plan number.
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
     * Inernal SPM Ratecard Id at line level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
    String rateCardId;
    /**
     * Subscribed services pricing model
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PricingModel {
        PayAsYouGo("PAY_AS_YOU_GO"),
        Monthly("MONTHLY"),
        Annual("ANNUAL"),
        Prepaid("PREPAID"),
        FundedAllocation("FUNDED_ALLOCATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PricingModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PricingModel v : PricingModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PricingModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PricingModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PricingModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Subscribed services pricing model
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    PricingModel pricingModel;

    /**
     * Aggregation of computed usages for the subscribed service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedComputedUsages")
    java.util.List<ComputedUsageAggregation> aggregatedComputedUsages;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
