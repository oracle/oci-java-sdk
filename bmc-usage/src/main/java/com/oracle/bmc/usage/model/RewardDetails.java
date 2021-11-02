/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The overrall reward summary of the monthly summary rewards.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RewardDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RewardDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rewardsRate")
        private Double rewardsRate;

        public Builder rewardsRate(Double rewardsRate) {
            this.rewardsRate = rewardsRate;
            this.__explicitlySet__.add("rewardsRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalRewardsAvailable")
        private Float totalRewardsAvailable;

        public Builder totalRewardsAvailable(Float totalRewardsAvailable) {
            this.totalRewardsAvailable = totalRewardsAvailable;
            this.__explicitlySet__.add("totalRewardsAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RewardDetails build() {
            RewardDetails __instance__ =
                    new RewardDetails(
                            tenancyId,
                            subscriptionId,
                            currency,
                            rewardsRate,
                            totalRewardsAvailable);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RewardDetails o) {
            Builder copiedBuilder =
                    tenancyId(o.getTenancyId())
                            .subscriptionId(o.getSubscriptionId())
                            .currency(o.getCurrency())
                            .rewardsRate(o.getRewardsRate())
                            .totalRewardsAvailable(o.getTotalRewardsAvailable());

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
     * The OCID of the target tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * The entitlement id from MQS and it is same as subcription id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    String subscriptionId;

    /**
     * The currency unit for the reward amount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    String currency;

    /**
     * The current Rewards percentage in decimal format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rewardsRate")
    Double rewardsRate;

    /**
     * The total number of available rewards for a given subscription Id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalRewardsAvailable")
    Float totalRewardsAvailable;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
