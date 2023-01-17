/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        /**
         * Credit card type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("creditCardType")
        private CreditCardType creditCardType;

        /**
         * Credit card type.
         * @param creditCardType the value to set
         * @return this builder
         **/
        public Builder creditCardType(CreditCardType creditCardType) {
            this.creditCardType = creditCardType;
            this.__explicitlySet__.add("creditCardType");
            return this;
        }
        /**
         * Last four digits of the card.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
        private String lastDigits;

        /**
         * Last four digits of the card.
         * @param lastDigits the value to set
         * @return this builder
         **/
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            this.__explicitlySet__.add("lastDigits");
            return this;
        }
        /**
         * Name on the credit card.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
        private String nameOnCard;

        /**
         * Name on the credit card.
         * @param nameOnCard the value to set
         * @return this builder
         **/
        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            this.__explicitlySet__.add("nameOnCard");
            return this;
        }
        /**
         * Expired date of the credit card.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
        private java.util.Date timeExpiration;

        /**
         * Expired date of the credit card.
         * @param timeExpiration the value to set
         * @return this builder
         **/
        public Builder timeExpiration(java.util.Date timeExpiration) {
            this.timeExpiration = timeExpiration;
            this.__explicitlySet__.add("timeExpiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreditCardPaymentOption build() {
            CreditCardPaymentOption model =
                    new CreditCardPaymentOption(
                            this.walletInstrumentId,
                            this.walletTransactionId,
                            this.creditCardType,
                            this.lastDigits,
                            this.nameOnCard,
                            this.timeExpiration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreditCardPaymentOption model) {
            if (model.wasPropertyExplicitlySet("walletInstrumentId")) {
                this.walletInstrumentId(model.getWalletInstrumentId());
            }
            if (model.wasPropertyExplicitlySet("walletTransactionId")) {
                this.walletTransactionId(model.getWalletTransactionId());
            }
            if (model.wasPropertyExplicitlySet("creditCardType")) {
                this.creditCardType(model.getCreditCardType());
            }
            if (model.wasPropertyExplicitlySet("lastDigits")) {
                this.lastDigits(model.getLastDigits());
            }
            if (model.wasPropertyExplicitlySet("nameOnCard")) {
                this.nameOnCard(model.getNameOnCard());
            }
            if (model.wasPropertyExplicitlySet("timeExpiration")) {
                this.timeExpiration(model.getTimeExpiration());
            }
            return this;
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

    /**
     * Credit card type.
     * @return the value
     **/
    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Last four digits of the card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
    private final String lastDigits;

    /**
     * Last four digits of the card.
     * @return the value
     **/
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Name on the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
    private final String nameOnCard;

    /**
     * Name on the credit card.
     * @return the value
     **/
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Expired date of the credit card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
    private final java.util.Date timeExpiration;

    /**
     * Expired date of the credit card.
     * @return the value
     **/
    public java.util.Date getTimeExpiration() {
        return timeExpiration;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreditCardPaymentOption(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", creditCardType=").append(String.valueOf(this.creditCardType));
        sb.append(", lastDigits=").append(String.valueOf(this.lastDigits));
        sb.append(", nameOnCard=").append(String.valueOf(this.nameOnCard));
        sb.append(", timeExpiration=").append(String.valueOf(this.timeExpiration));
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
                && super.equals(other);
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
        return result;
    }
}
