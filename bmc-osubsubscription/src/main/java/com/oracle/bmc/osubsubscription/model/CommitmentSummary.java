/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Subscribed Service commitment summary
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
    builder = CommitmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CommitmentSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeStart",
        "timeEnd",
        "quantity",
        "usedAmount",
        "availableAmount",
        "fundedAllocationValue"
    })
    public CommitmentSummary(
            String id,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String quantity,
            String usedAmount,
            String availableAmount,
            String fundedAllocationValue) {
        super();
        this.id = id;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.quantity = quantity;
        this.usedAmount = usedAmount;
        this.availableAmount = availableAmount;
        this.fundedAllocationValue = fundedAllocationValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
        private String usedAmount;

        public Builder usedAmount(String usedAmount) {
            this.usedAmount = usedAmount;
            this.__explicitlySet__.add("usedAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
        private String availableAmount;

        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            this.__explicitlySet__.add("availableAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitmentSummary build() {
            CommitmentSummary __instance__ =
                    new CommitmentSummary(
                            id,
                            timeStart,
                            timeEnd,
                            quantity,
                            usedAmount,
                            availableAmount,
                            fundedAllocationValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitmentSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .quantity(o.getQuantity())
                            .usedAmount(o.getUsedAmount())
                            .availableAmount(o.getAvailableAmount())
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
     * SPM internal Commitment ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Commitment start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Commitment end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Commitment quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    public String getQuantity() {
        return quantity;
    }

    /**
     * Commitment used amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
    private final String usedAmount;

    public String getUsedAmount() {
        return usedAmount;
    }

    /**
     * Commitment available amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    private final String availableAmount;

    public String getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    public String getFundedAllocationValue() {
        return fundedAllocationValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CommitmentSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", usedAmount=").append(String.valueOf(this.usedAmount));
        sb.append(", availableAmount=").append(String.valueOf(this.availableAmount));
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
        if (!(o instanceof CommitmentSummary)) {
            return false;
        }

        CommitmentSummary other = (CommitmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.usedAmount, other.usedAmount)
                && java.util.Objects.equals(this.availableAmount, other.availableAmount)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.usedAmount == null ? 43 : this.usedAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAmount == null ? 43 : this.availableAmount.hashCode());
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
