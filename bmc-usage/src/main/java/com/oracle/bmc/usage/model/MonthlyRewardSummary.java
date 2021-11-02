/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Object describing the rewards summary for a month for the requested subscriptionId.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonthlyRewardSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonthlyRewardSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availableRewards")
        private Float availableRewards;

        public Builder availableRewards(Float availableRewards) {
            this.availableRewards = availableRewards;
            this.__explicitlySet__.add("availableRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
        private Float redeemedRewards;

        public Builder redeemedRewards(Float redeemedRewards) {
            this.redeemedRewards = redeemedRewards;
            this.__explicitlySet__.add("redeemedRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
        private Float earnedRewards;

        public Builder earnedRewards(Float earnedRewards) {
            this.earnedRewards = earnedRewards;
            this.__explicitlySet__.add("earnedRewards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isManual")
        private Boolean isManual;

        public Builder isManual(Boolean isManual) {
            this.isManual = isManual;
            this.__explicitlySet__.add("isManual");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsExpired")
        private java.util.Date timeRewardsExpired;

        public Builder timeRewardsExpired(java.util.Date timeRewardsExpired) {
            this.timeRewardsExpired = timeRewardsExpired;
            this.__explicitlySet__.add("timeRewardsExpired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsEarned")
        private java.util.Date timeRewardsEarned;

        public Builder timeRewardsEarned(java.util.Date timeRewardsEarned) {
            this.timeRewardsEarned = timeRewardsEarned;
            this.__explicitlySet__.add("timeRewardsEarned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
        private Double usageAmount;

        public Builder usageAmount(Double usageAmount) {
            this.usageAmount = usageAmount;
            this.__explicitlySet__.add("usageAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eligibleUsageAmount")
        private Double eligibleUsageAmount;

        public Builder eligibleUsageAmount(Double eligibleUsageAmount) {
            this.eligibleUsageAmount = eligibleUsageAmount;
            this.__explicitlySet__.add("eligibleUsageAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ineligibleUsageAmount")
        private Double ineligibleUsageAmount;

        public Builder ineligibleUsageAmount(Double ineligibleUsageAmount) {
            this.ineligibleUsageAmount = ineligibleUsageAmount;
            this.__explicitlySet__.add("ineligibleUsageAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usagePeriodKey")
        private String usagePeriodKey;

        public Builder usagePeriodKey(String usagePeriodKey) {
            this.usagePeriodKey = usagePeriodKey;
            this.__explicitlySet__.add("usagePeriodKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonthlyRewardSummary build() {
            MonthlyRewardSummary __instance__ =
                    new MonthlyRewardSummary(
                            availableRewards,
                            redeemedRewards,
                            earnedRewards,
                            isManual,
                            timeRewardsExpired,
                            timeRewardsEarned,
                            timeUsageStarted,
                            timeUsageEnded,
                            usageAmount,
                            eligibleUsageAmount,
                            ineligibleUsageAmount,
                            usagePeriodKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonthlyRewardSummary o) {
            Builder copiedBuilder =
                    availableRewards(o.getAvailableRewards())
                            .redeemedRewards(o.getRedeemedRewards())
                            .earnedRewards(o.getEarnedRewards())
                            .isManual(o.getIsManual())
                            .timeRewardsExpired(o.getTimeRewardsExpired())
                            .timeRewardsEarned(o.getTimeRewardsEarned())
                            .timeUsageStarted(o.getTimeUsageStarted())
                            .timeUsageEnded(o.getTimeUsageEnded())
                            .usageAmount(o.getUsageAmount())
                            .eligibleUsageAmount(o.getEligibleUsageAmount())
                            .ineligibleUsageAmount(o.getIneligibleUsageAmount())
                            .usagePeriodKey(o.getUsagePeriodKey());

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
     * The number of rewards available for a specific usage period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableRewards")
    Float availableRewards;

    /**
     * The number of rewards redeemed for a specific month.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
    Float redeemedRewards;

    /**
     * The number of rewards earned for the specific usage period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    Float earnedRewards;

    /**
     * The boolean flag to tell if the available rewards are posted manually or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManual")
    Boolean isManual;

    /**
     * The date and time on which rewards are expired.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsExpired")
    java.util.Date timeRewardsExpired;

    /**
     * The date and time on which rewards are accrued.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsEarned")
    java.util.Date timeRewardsEarned;

    /**
     * The start date and time for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    java.util.Date timeUsageStarted;

    /**
     * The end date and time for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    java.util.Date timeUsageEnded;

    /**
     * The usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    Double usageAmount;

    /**
     * The eligible usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eligibleUsageAmount")
    Double eligibleUsageAmount;

    /**
     * The in eligible usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibleUsageAmount")
    Double ineligibleUsageAmount;

    /**
     * The id for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usagePeriodKey")
    String usagePeriodKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
