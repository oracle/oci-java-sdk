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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CommitmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CommitmentSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * SPM internal Commitment ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Commitment start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Commitment end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * Commitment quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    String quantity;

    /**
     * Commitment used amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
    String usedAmount;

    /**
     * Commitment available amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    String availableAmount;

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    String fundedAllocationValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
