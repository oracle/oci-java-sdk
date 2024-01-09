/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The overall monthly reward summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RewardDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RewardDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenancyId",
        "subscriptionId",
        "currency",
        "rewardsRate",
        "totalRewardsAvailable",
        "redemptionCode"
    })
    public RewardDetails(
            String tenancyId,
            String subscriptionId,
            String currency,
            Double rewardsRate,
            Float totalRewardsAvailable,
            String redemptionCode) {
        super();
        this.tenancyId = tenancyId;
        this.subscriptionId = subscriptionId;
        this.currency = currency;
        this.rewardsRate = rewardsRate;
        this.totalRewardsAvailable = totalRewardsAvailable;
        this.redemptionCode = redemptionCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The OCID of the target tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** The entitlement ID from MQS, which is the same as the subcription ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The entitlement ID from MQS, which is the same as the subcription ID.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** The currency unit for the reward amount. */
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        /**
         * The currency unit for the reward amount.
         *
         * @param currency the value to set
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /** The current Rewards percentage in decimal format. */
        @com.fasterxml.jackson.annotation.JsonProperty("rewardsRate")
        private Double rewardsRate;

        /**
         * The current Rewards percentage in decimal format.
         *
         * @param rewardsRate the value to set
         * @return this builder
         */
        public Builder rewardsRate(Double rewardsRate) {
            this.rewardsRate = rewardsRate;
            this.__explicitlySet__.add("rewardsRate");
            return this;
        }
        /** The total number of available rewards for a given subscription ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalRewardsAvailable")
        private Float totalRewardsAvailable;

        /**
         * The total number of available rewards for a given subscription ID.
         *
         * @param totalRewardsAvailable the value to set
         * @return this builder
         */
        public Builder totalRewardsAvailable(Float totalRewardsAvailable) {
            this.totalRewardsAvailable = totalRewardsAvailable;
            this.__explicitlySet__.add("totalRewardsAvailable");
            return this;
        }
        /** The redemption code used in the Billing Center during the reward redemption process. */
        @com.fasterxml.jackson.annotation.JsonProperty("redemptionCode")
        private String redemptionCode;

        /**
         * The redemption code used in the Billing Center during the reward redemption process.
         *
         * @param redemptionCode the value to set
         * @return this builder
         */
        public Builder redemptionCode(String redemptionCode) {
            this.redemptionCode = redemptionCode;
            this.__explicitlySet__.add("redemptionCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RewardDetails build() {
            RewardDetails model =
                    new RewardDetails(
                            this.tenancyId,
                            this.subscriptionId,
                            this.currency,
                            this.rewardsRate,
                            this.totalRewardsAvailable,
                            this.redemptionCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RewardDetails model) {
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("rewardsRate")) {
                this.rewardsRate(model.getRewardsRate());
            }
            if (model.wasPropertyExplicitlySet("totalRewardsAvailable")) {
                this.totalRewardsAvailable(model.getTotalRewardsAvailable());
            }
            if (model.wasPropertyExplicitlySet("redemptionCode")) {
                this.redemptionCode(model.getRedemptionCode());
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

    /** The OCID of the target tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The OCID of the target tenancy.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** The entitlement ID from MQS, which is the same as the subcription ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The entitlement ID from MQS, which is the same as the subcription ID.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** The currency unit for the reward amount. */
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final String currency;

    /**
     * The currency unit for the reward amount.
     *
     * @return the value
     */
    public String getCurrency() {
        return currency;
    }

    /** The current Rewards percentage in decimal format. */
    @com.fasterxml.jackson.annotation.JsonProperty("rewardsRate")
    private final Double rewardsRate;

    /**
     * The current Rewards percentage in decimal format.
     *
     * @return the value
     */
    public Double getRewardsRate() {
        return rewardsRate;
    }

    /** The total number of available rewards for a given subscription ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalRewardsAvailable")
    private final Float totalRewardsAvailable;

    /**
     * The total number of available rewards for a given subscription ID.
     *
     * @return the value
     */
    public Float getTotalRewardsAvailable() {
        return totalRewardsAvailable;
    }

    /** The redemption code used in the Billing Center during the reward redemption process. */
    @com.fasterxml.jackson.annotation.JsonProperty("redemptionCode")
    private final String redemptionCode;

    /**
     * The redemption code used in the Billing Center during the reward redemption process.
     *
     * @return the value
     */
    public String getRedemptionCode() {
        return redemptionCode;
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
        sb.append("RewardDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", rewardsRate=").append(String.valueOf(this.rewardsRate));
        sb.append(", totalRewardsAvailable=").append(String.valueOf(this.totalRewardsAvailable));
        sb.append(", redemptionCode=").append(String.valueOf(this.redemptionCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RewardDetails)) {
            return false;
        }

        RewardDetails other = (RewardDetails) o;
        return java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.rewardsRate, other.rewardsRate)
                && java.util.Objects.equals(this.totalRewardsAvailable, other.totalRewardsAvailable)
                && java.util.Objects.equals(this.redemptionCode, other.redemptionCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.rewardsRate == null ? 43 : this.rewardsRate.hashCode());
        result =
                (result * PRIME)
                        + (this.totalRewardsAvailable == null
                                ? 43
                                : this.totalRewardsAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.redemptionCode == null ? 43 : this.redemptionCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
