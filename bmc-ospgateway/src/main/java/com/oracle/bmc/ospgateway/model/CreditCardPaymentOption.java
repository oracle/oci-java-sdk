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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreditCardPaymentOption.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "paymentMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreditCardPaymentOption extends PaymentOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final CreditCardType creditCardType;

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Last four digits of the card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
    private final String lastDigits;

    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Name on the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
    private final String nameOnCard;

    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Expired date of the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
    private final java.util.Date timeExpiration;

    public java.util.Date getTimeExpiration() {
        return timeExpiration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreditCardPaymentOption(");
        sb.append("super=").append(super.toString());
        sb.append(", creditCardType=").append(String.valueOf(this.creditCardType));
        sb.append(", lastDigits=").append(String.valueOf(this.lastDigits));
        sb.append(", nameOnCard=").append(String.valueOf(this.nameOnCard));
        sb.append(", timeExpiration=").append(String.valueOf(this.timeExpiration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreditCardPaymentOption)) {
            return false;
        }

        CreditCardPaymentOption other = (CreditCardPaymentOption) o;
        return java.util.Objects.equals(this.creditCardType, other.creditCardType)
                && java.util.Objects.equals(this.lastDigits, other.lastDigits)
                && java.util.Objects.equals(this.nameOnCard, other.nameOnCard)
                && java.util.Objects.equals(this.timeExpiration, other.timeExpiration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.creditCardType == null ? 43 : this.creditCardType.hashCode());
        result = (result * PRIME) + (this.lastDigits == null ? 43 : this.lastDigits.hashCode());
        result = (result * PRIME) + (this.nameOnCard == null ? 43 : this.nameOnCard.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpiration == null ? 43 : this.timeExpiration.hashCode());
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
