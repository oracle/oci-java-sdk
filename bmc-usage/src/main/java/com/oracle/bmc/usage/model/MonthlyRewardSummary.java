/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Object describing the monthly rewards summary for the requested subscription ID.
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
    builder = MonthlyRewardSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonthlyRewardSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availableRewards",
        "redeemedRewards",
        "earnedRewards",
        "isManual",
        "timeRewardsExpired",
        "timeRewardsEarned",
        "timeUsageStarted",
        "timeUsageEnded",
        "usageAmount",
        "eligibleUsageAmount",
        "ineligibleUsageAmount",
        "usagePeriodKey"
    })
    public MonthlyRewardSummary(
            Float availableRewards,
            Float redeemedRewards,
            Float earnedRewards,
            Boolean isManual,
            java.util.Date timeRewardsExpired,
            java.util.Date timeRewardsEarned,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            Double usageAmount,
            Double eligibleUsageAmount,
            Double ineligibleUsageAmount,
            String usagePeriodKey) {
        super();
        this.availableRewards = availableRewards;
        this.redeemedRewards = redeemedRewards;
        this.earnedRewards = earnedRewards;
        this.isManual = isManual;
        this.timeRewardsExpired = timeRewardsExpired;
        this.timeRewardsEarned = timeRewardsEarned;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.usageAmount = usageAmount;
        this.eligibleUsageAmount = eligibleUsageAmount;
        this.ineligibleUsageAmount = ineligibleUsageAmount;
        this.usagePeriodKey = usagePeriodKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of rewards available for a specific usage period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableRewards")
    private final Float availableRewards;

    public Float getAvailableRewards() {
        return availableRewards;
    }

    /**
     * The number of rewards redeemed for a specific month.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
    private final Float redeemedRewards;

    public Float getRedeemedRewards() {
        return redeemedRewards;
    }

    /**
     * The number of rewards earned for the specific usage period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    private final Float earnedRewards;

    public Float getEarnedRewards() {
        return earnedRewards;
    }

    /**
     * The boolean parameter to indicate whether or not the available rewards are manually posted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManual")
    private final Boolean isManual;

    public Boolean getIsManual() {
        return isManual;
    }

    /**
     * The date and time when rewards expire.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsExpired")
    private final java.util.Date timeRewardsExpired;

    public java.util.Date getTimeRewardsExpired() {
        return timeRewardsExpired;
    }

    /**
     * The date and time when rewards accrue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsEarned")
    private final java.util.Date timeRewardsEarned;

    public java.util.Date getTimeRewardsEarned() {
        return timeRewardsEarned;
    }

    /**
     * The start date and time for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /**
     * The end date and time for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /**
     * The usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    private final Double usageAmount;

    public Double getUsageAmount() {
        return usageAmount;
    }

    /**
     * The eligible usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eligibleUsageAmount")
    private final Double eligibleUsageAmount;

    public Double getEligibleUsageAmount() {
        return eligibleUsageAmount;
    }

    /**
     * The ineligible usage amount for the usage period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibleUsageAmount")
    private final Double ineligibleUsageAmount;

    public Double getIneligibleUsageAmount() {
        return ineligibleUsageAmount;
    }

    /**
     * The usage period ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usagePeriodKey")
    private final String usagePeriodKey;

    public String getUsagePeriodKey() {
        return usagePeriodKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MonthlyRewardSummary(");
        sb.append("availableRewards=").append(String.valueOf(this.availableRewards));
        sb.append(", redeemedRewards=").append(String.valueOf(this.redeemedRewards));
        sb.append(", earnedRewards=").append(String.valueOf(this.earnedRewards));
        sb.append(", isManual=").append(String.valueOf(this.isManual));
        sb.append(", timeRewardsExpired=").append(String.valueOf(this.timeRewardsExpired));
        sb.append(", timeRewardsEarned=").append(String.valueOf(this.timeRewardsEarned));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", usageAmount=").append(String.valueOf(this.usageAmount));
        sb.append(", eligibleUsageAmount=").append(String.valueOf(this.eligibleUsageAmount));
        sb.append(", ineligibleUsageAmount=").append(String.valueOf(this.ineligibleUsageAmount));
        sb.append(", usagePeriodKey=").append(String.valueOf(this.usagePeriodKey));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonthlyRewardSummary)) {
            return false;
        }

        MonthlyRewardSummary other = (MonthlyRewardSummary) o;
        return java.util.Objects.equals(this.availableRewards, other.availableRewards)
                && java.util.Objects.equals(this.redeemedRewards, other.redeemedRewards)
                && java.util.Objects.equals(this.earnedRewards, other.earnedRewards)
                && java.util.Objects.equals(this.isManual, other.isManual)
                && java.util.Objects.equals(this.timeRewardsExpired, other.timeRewardsExpired)
                && java.util.Objects.equals(this.timeRewardsEarned, other.timeRewardsEarned)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(this.usageAmount, other.usageAmount)
                && java.util.Objects.equals(this.eligibleUsageAmount, other.eligibleUsageAmount)
                && java.util.Objects.equals(this.ineligibleUsageAmount, other.ineligibleUsageAmount)
                && java.util.Objects.equals(this.usagePeriodKey, other.usagePeriodKey)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availableRewards == null ? 43 : this.availableRewards.hashCode());
        result =
                (result * PRIME)
                        + (this.redeemedRewards == null ? 43 : this.redeemedRewards.hashCode());
        result =
                (result * PRIME)
                        + (this.earnedRewards == null ? 43 : this.earnedRewards.hashCode());
        result = (result * PRIME) + (this.isManual == null ? 43 : this.isManual.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRewardsExpired == null
                                ? 43
                                : this.timeRewardsExpired.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRewardsEarned == null ? 43 : this.timeRewardsEarned.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result = (result * PRIME) + (this.usageAmount == null ? 43 : this.usageAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.eligibleUsageAmount == null
                                ? 43
                                : this.eligibleUsageAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.ineligibleUsageAmount == null
                                ? 43
                                : this.ineligibleUsageAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.usagePeriodKey == null ? 43 : this.usagePeriodKey.hashCode());
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
