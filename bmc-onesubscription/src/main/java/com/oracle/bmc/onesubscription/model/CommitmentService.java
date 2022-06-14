/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Subscribed service commitment details
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
    builder = CommitmentService.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommitmentService {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeStart",
        "timeEnd",
        "quantity",
        "availableAmount",
        "lineNetAmount",
        "fundedAllocationValue"
    })
    public CommitmentService(
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String quantity,
            String availableAmount,
            String lineNetAmount,
            String fundedAllocationValue) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.quantity = quantity;
        this.availableAmount = availableAmount;
        this.lineNetAmount = lineNetAmount;
        this.fundedAllocationValue = fundedAllocationValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Commitment start date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Commitment start date
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Commitment end date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Commitment end date
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Commitment quantity
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Commitment quantity
         *
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Commitment available amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
        private String availableAmount;

        /**
         * Commitment available amount
         *
         * @param availableAmount the value to set
         * @return this builder
         **/
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            this.__explicitlySet__.add("availableAmount");
            return this;
        }
        /**
         * Commitment line net amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineNetAmount")
        private String lineNetAmount;

        /**
         * Commitment line net amount
         *
         * @param lineNetAmount the value to set
         * @return this builder
         **/
        public Builder lineNetAmount(String lineNetAmount) {
            this.lineNetAmount = lineNetAmount;
            this.__explicitlySet__.add("lineNetAmount");
            return this;
        }
        /**
         * Funded Allocation line value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        /**
         * Funded Allocation line value
         *
         * @param fundedAllocationValue the value to set
         * @return this builder
         **/
        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitmentService build() {
            CommitmentService __instance__ =
                    new CommitmentService(
                            timeStart,
                            timeEnd,
                            quantity,
                            availableAmount,
                            lineNetAmount,
                            fundedAllocationValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitmentService o) {
            Builder copiedBuilder =
                    timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .quantity(o.getQuantity())
                            .availableAmount(o.getAvailableAmount())
                            .lineNetAmount(o.getLineNetAmount())
                            .fundedAllocationValue(o.getFundedAllocationValue());

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
     * Commitment start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Commitment start date
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Commitment end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Commitment end date
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Commitment quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Commitment quantity
     *
     * @return the value
     **/
    public String getQuantity() {
        return quantity;
    }

    /**
     * Commitment available amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    private final String availableAmount;

    /**
     * Commitment available amount
     *
     * @return the value
     **/
    public String getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Commitment line net amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineNetAmount")
    private final String lineNetAmount;

    /**
     * Commitment line net amount
     *
     * @return the value
     **/
    public String getLineNetAmount() {
        return lineNetAmount;
    }

    /**
     * Funded Allocation line value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    /**
     * Funded Allocation line value
     *
     * @return the value
     **/
    public String getFundedAllocationValue() {
        return fundedAllocationValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommitmentService(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", availableAmount=").append(String.valueOf(this.availableAmount));
        sb.append(", lineNetAmount=").append(String.valueOf(this.lineNetAmount));
        sb.append(", fundedAllocationValue=").append(String.valueOf(this.fundedAllocationValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitmentService)) {
            return false;
        }

        CommitmentService other = (CommitmentService) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.availableAmount, other.availableAmount)
                && java.util.Objects.equals(this.lineNetAmount, other.lineNetAmount)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAmount == null ? 43 : this.availableAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.lineNetAmount == null ? 43 : this.lineNetAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.fundedAllocationValue == null
                                ? 43
                                : this.fundedAllocationValue.hashCode());
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
