/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    builder = CreditCardPaymentOption.Builder.class
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
public class CreditCardPaymentOption extends PaymentOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("walletInstrumentId")
        private String walletInstrumentId;

        public Builder walletInstrumentId(String walletInstrumentId) {
            this.walletInstrumentId = walletInstrumentId;
            this.__explicitlySet__.add("walletInstrumentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("walletTransactionId")
        private String walletTransactionId;

        public Builder walletTransactionId(String walletTransactionId) {
            this.walletTransactionId = walletTransactionId;
            this.__explicitlySet__.add("walletTransactionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creditCardType")
        private CreditCardType creditCardType;

        public Builder creditCardType(CreditCardType creditCardType) {
            this.creditCardType = creditCardType;
            this.__explicitlySet__.add("creditCardType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
        private String lastDigits;

        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            this.__explicitlySet__.add("lastDigits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
        private String nameOnCard;

        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            this.__explicitlySet__.add("nameOnCard");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
        private java.util.Date timeExpiration;

        public Builder timeExpiration(java.util.Date timeExpiration) {
            this.timeExpiration = timeExpiration;
            this.__explicitlySet__.add("timeExpiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreditCardPaymentOption build() {
            CreditCardPaymentOption __instance__ =
                    new CreditCardPaymentOption(
                            walletInstrumentId,
                            walletTransactionId,
                            creditCardType,
                            lastDigits,
                            nameOnCard,
                            timeExpiration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreditCardPaymentOption o) {
            Builder copiedBuilder =
                    walletInstrumentId(o.getWalletInstrumentId())
                            .walletTransactionId(o.getWalletTransactionId())
                            .creditCardType(o.getCreditCardType())
                            .lastDigits(o.getLastDigits())
                            .nameOnCard(o.getNameOnCard())
                            .timeExpiration(o.getTimeExpiration());

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
    public CreditCardPaymentOption(
            String walletInstrumentId,
            String walletTransactionId,
            CreditCardType creditCardType,
            String lastDigits,
            String nameOnCard,
            java.util.Date timeExpiration) {
        super(walletInstrumentId, walletTransactionId);
        this.creditCardType = creditCardType;
        this.lastDigits = lastDigits;
        this.nameOnCard = nameOnCard;
        this.timeExpiration = timeExpiration;
    }

    /**
     * Credit card type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creditCardType")
    CreditCardType creditCardType;

    /**
     * Last four digits of the card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
    String lastDigits;

    /**
     * Name on the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
    String nameOnCard;

    /**
     * Expired date of the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
    java.util.Date timeExpiration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
