/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Credit card Payment related details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreditCardPaymentDetail.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "paymentMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreditCardPaymentDetail extends PaymentDetail {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timePaidOn")
        private java.util.Date timePaidOn;

        public Builder timePaidOn(java.util.Date timePaidOn) {
            this.timePaidOn = timePaidOn;
            this.__explicitlySet__.add("timePaidOn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paidBy")
        private String paidBy;

        public Builder paidBy(String paidBy) {
            this.paidBy = paidBy;
            this.__explicitlySet__.add("paidBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("amountPaid")
        private java.math.BigDecimal amountPaid;

        public Builder amountPaid(java.math.BigDecimal amountPaid) {
            this.amountPaid = amountPaid;
            this.__explicitlySet__.add("amountPaid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreditCardPaymentDetail build() {
            CreditCardPaymentDetail __instance__ =
                    new CreditCardPaymentDetail(timePaidOn, paidBy, amountPaid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreditCardPaymentDetail o) {
            Builder copiedBuilder =
                    timePaidOn(o.getTimePaidOn())
                            .paidBy(o.getPaidBy())
                            .amountPaid(o.getAmountPaid());

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

    @Deprecated
    public CreditCardPaymentDetail(
            java.util.Date timePaidOn, String paidBy, java.math.BigDecimal amountPaid) {
        super(timePaidOn, paidBy, amountPaid);
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
