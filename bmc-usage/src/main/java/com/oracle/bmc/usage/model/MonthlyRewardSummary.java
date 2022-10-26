/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * Object describing the monthly rewards summary for the requested subscription ID. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MonthlyRewardSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MonthlyRewardSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The number of rewards available for a specific usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableRewards")
        private Float availableRewards;

        /**
         * The number of rewards available for a specific usage period.
         *
         * @param availableRewards the value to set
         * @return this builder
         */
        public Builder availableRewards(Float availableRewards) {
            this.availableRewards = availableRewards;
            this.__explicitlySet__.add("availableRewards");
            return this;
        }
        /** The number of rewards redeemed for a specific month. */
        @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
        private Float redeemedRewards;

        /**
         * The number of rewards redeemed for a specific month.
         *
         * @param redeemedRewards the value to set
         * @return this builder
         */
        public Builder redeemedRewards(Float redeemedRewards) {
            this.redeemedRewards = redeemedRewards;
            this.__explicitlySet__.add("redeemedRewards");
            return this;
        }
        /** The number of rewards earned for the specific usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
        private Float earnedRewards;

        /**
         * The number of rewards earned for the specific usage period.
         *
         * @param earnedRewards the value to set
         * @return this builder
         */
        public Builder earnedRewards(Float earnedRewards) {
            this.earnedRewards = earnedRewards;
            this.__explicitlySet__.add("earnedRewards");
            return this;
        }
        /**
         * The boolean parameter to indicate whether or not the available rewards are manually
         * posted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isManual")
        private Boolean isManual;

        /**
         * The boolean parameter to indicate whether or not the available rewards are manually
         * posted.
         *
         * @param isManual the value to set
         * @return this builder
         */
        public Builder isManual(Boolean isManual) {
            this.isManual = isManual;
            this.__explicitlySet__.add("isManual");
            return this;
        }
        /** The date and time when rewards expire. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsExpired")
        private java.util.Date timeRewardsExpired;

        /**
         * The date and time when rewards expire.
         *
         * @param timeRewardsExpired the value to set
         * @return this builder
         */
        public Builder timeRewardsExpired(java.util.Date timeRewardsExpired) {
            this.timeRewardsExpired = timeRewardsExpired;
            this.__explicitlySet__.add("timeRewardsExpired");
            return this;
        }
        /** The date and time when rewards accrue. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsEarned")
        private java.util.Date timeRewardsEarned;

        /**
         * The date and time when rewards accrue.
         *
         * @param timeRewardsEarned the value to set
         * @return this builder
         */
        public Builder timeRewardsEarned(java.util.Date timeRewardsEarned) {
            this.timeRewardsEarned = timeRewardsEarned;
            this.__explicitlySet__.add("timeRewardsEarned");
            return this;
        }
        /** The start date and time for the usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The start date and time for the usage period.
         *
         * @param timeUsageStarted the value to set
         * @return this builder
         */
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /** The end date and time for the usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The end date and time for the usage period.
         *
         * @param timeUsageEnded the value to set
         * @return this builder
         */
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }
        /** The usage amount for the usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
        private Double usageAmount;

        /**
         * The usage amount for the usage period.
         *
         * @param usageAmount the value to set
         * @return this builder
         */
        public Builder usageAmount(Double usageAmount) {
            this.usageAmount = usageAmount;
            this.__explicitlySet__.add("usageAmount");
            return this;
        }
        /** The eligible usage amount for the usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("eligibleUsageAmount")
        private Double eligibleUsageAmount;

        /**
         * The eligible usage amount for the usage period.
         *
         * @param eligibleUsageAmount the value to set
         * @return this builder
         */
        public Builder eligibleUsageAmount(Double eligibleUsageAmount) {
            this.eligibleUsageAmount = eligibleUsageAmount;
            this.__explicitlySet__.add("eligibleUsageAmount");
            return this;
        }
        /** The ineligible usage amount for the usage period. */
        @com.fasterxml.jackson.annotation.JsonProperty("ineligibleUsageAmount")
        private Double ineligibleUsageAmount;

        /**
         * The ineligible usage amount for the usage period.
         *
         * @param ineligibleUsageAmount the value to set
         * @return this builder
         */
        public Builder ineligibleUsageAmount(Double ineligibleUsageAmount) {
            this.ineligibleUsageAmount = ineligibleUsageAmount;
            this.__explicitlySet__.add("ineligibleUsageAmount");
            return this;
        }
        /** The usage period ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("usagePeriodKey")
        private String usagePeriodKey;

        /**
         * The usage period ID.
         *
         * @param usagePeriodKey the value to set
         * @return this builder
         */
        public Builder usagePeriodKey(String usagePeriodKey) {
            this.usagePeriodKey = usagePeriodKey;
            this.__explicitlySet__.add("usagePeriodKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonthlyRewardSummary build() {
            MonthlyRewardSummary model =
                    new MonthlyRewardSummary(
                            this.availableRewards,
                            this.redeemedRewards,
                            this.earnedRewards,
                            this.isManual,
                            this.timeRewardsExpired,
                            this.timeRewardsEarned,
                            this.timeUsageStarted,
                            this.timeUsageEnded,
                            this.usageAmount,
                            this.eligibleUsageAmount,
                            this.ineligibleUsageAmount,
                            this.usagePeriodKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonthlyRewardSummary model) {
            if (model.wasPropertyExplicitlySet("availableRewards")) {
                this.availableRewards(model.getAvailableRewards());
            }
            if (model.wasPropertyExplicitlySet("redeemedRewards")) {
                this.redeemedRewards(model.getRedeemedRewards());
            }
            if (model.wasPropertyExplicitlySet("earnedRewards")) {
                this.earnedRewards(model.getEarnedRewards());
            }
            if (model.wasPropertyExplicitlySet("isManual")) {
                this.isManual(model.getIsManual());
            }
            if (model.wasPropertyExplicitlySet("timeRewardsExpired")) {
                this.timeRewardsExpired(model.getTimeRewardsExpired());
            }
            if (model.wasPropertyExplicitlySet("timeRewardsEarned")) {
                this.timeRewardsEarned(model.getTimeRewardsEarned());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
            }
            if (model.wasPropertyExplicitlySet("usageAmount")) {
                this.usageAmount(model.getUsageAmount());
            }
            if (model.wasPropertyExplicitlySet("eligibleUsageAmount")) {
                this.eligibleUsageAmount(model.getEligibleUsageAmount());
            }
            if (model.wasPropertyExplicitlySet("ineligibleUsageAmount")) {
                this.ineligibleUsageAmount(model.getIneligibleUsageAmount());
            }
            if (model.wasPropertyExplicitlySet("usagePeriodKey")) {
                this.usagePeriodKey(model.getUsagePeriodKey());
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

    /** The number of rewards available for a specific usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableRewards")
    private final Float availableRewards;

    /**
     * The number of rewards available for a specific usage period.
     *
     * @return the value
     */
    public Float getAvailableRewards() {
        return availableRewards;
    }

    /** The number of rewards redeemed for a specific month. */
    @com.fasterxml.jackson.annotation.JsonProperty("redeemedRewards")
    private final Float redeemedRewards;

    /**
     * The number of rewards redeemed for a specific month.
     *
     * @return the value
     */
    public Float getRedeemedRewards() {
        return redeemedRewards;
    }

    /** The number of rewards earned for the specific usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("earnedRewards")
    private final Float earnedRewards;

    /**
     * The number of rewards earned for the specific usage period.
     *
     * @return the value
     */
    public Float getEarnedRewards() {
        return earnedRewards;
    }

    /**
     * The boolean parameter to indicate whether or not the available rewards are manually posted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isManual")
    private final Boolean isManual;

    /**
     * The boolean parameter to indicate whether or not the available rewards are manually posted.
     *
     * @return the value
     */
    public Boolean getIsManual() {
        return isManual;
    }

    /** The date and time when rewards expire. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsExpired")
    private final java.util.Date timeRewardsExpired;

    /**
     * The date and time when rewards expire.
     *
     * @return the value
     */
    public java.util.Date getTimeRewardsExpired() {
        return timeRewardsExpired;
    }

    /** The date and time when rewards accrue. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRewardsEarned")
    private final java.util.Date timeRewardsEarned;

    /**
     * The date and time when rewards accrue.
     *
     * @return the value
     */
    public java.util.Date getTimeRewardsEarned() {
        return timeRewardsEarned;
    }

    /** The start date and time for the usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The start date and time for the usage period.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /** The end date and time for the usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The end date and time for the usage period.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /** The usage amount for the usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageAmount")
    private final Double usageAmount;

    /**
     * The usage amount for the usage period.
     *
     * @return the value
     */
    public Double getUsageAmount() {
        return usageAmount;
    }

    /** The eligible usage amount for the usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("eligibleUsageAmount")
    private final Double eligibleUsageAmount;

    /**
     * The eligible usage amount for the usage period.
     *
     * @return the value
     */
    public Double getEligibleUsageAmount() {
        return eligibleUsageAmount;
    }

    /** The ineligible usage amount for the usage period. */
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibleUsageAmount")
    private final Double ineligibleUsageAmount;

    /**
     * The ineligible usage amount for the usage period.
     *
     * @return the value
     */
    public Double getIneligibleUsageAmount() {
        return ineligibleUsageAmount;
    }

    /** The usage period ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("usagePeriodKey")
    private final String usagePeriodKey;

    /**
     * The usage period ID.
     *
     * @return the value
     */
    public String getUsagePeriodKey() {
        return usagePeriodKey;
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
        sb.append("MonthlyRewardSummary(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
