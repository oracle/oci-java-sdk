/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Credit card Payment related details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreditCardPaymentDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "paymentMethod")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreditCardPaymentDetail extends PaymentDetail {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /** Name on the credit card */
        @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
        private String nameOnCard;

        /**
         * Name on the credit card
         *
         * @param nameOnCard the value to set
         * @return this builder
         */
        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            this.__explicitlySet__.add("nameOnCard");
            return this;
        }
        /** Credit card type */
        @com.fasterxml.jackson.annotation.JsonProperty("creditCardType")
        private CreditCardType creditCardType;

        /**
         * Credit card type
         *
         * @param creditCardType the value to set
         * @return this builder
         */
        public Builder creditCardType(CreditCardType creditCardType) {
            this.creditCardType = creditCardType;
            this.__explicitlySet__.add("creditCardType");
            return this;
        }
        /** Last four digits of the card */
        @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
        private String lastDigits;

        /**
         * Last four digits of the card
         *
         * @param lastDigits the value to set
         * @return this builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            this.__explicitlySet__.add("lastDigits");
            return this;
        }
        /** Expired date of the credit card */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
        private java.util.Date timeExpiration;

        /**
         * Expired date of the credit card
         *
         * @param timeExpiration the value to set
         * @return this builder
         */
        public Builder timeExpiration(java.util.Date timeExpiration) {
            this.timeExpiration = timeExpiration;
            this.__explicitlySet__.add("timeExpiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreditCardPaymentDetail build() {
            CreditCardPaymentDetail model =
                    new CreditCardPaymentDetail(
                            this.timePaidOn,
                            this.paidBy,
                            this.amountPaid,
                            this.nameOnCard,
                            this.creditCardType,
                            this.lastDigits,
                            this.timeExpiration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreditCardPaymentDetail model) {
            if (model.wasPropertyExplicitlySet("timePaidOn")) {
                this.timePaidOn(model.getTimePaidOn());
            }
            if (model.wasPropertyExplicitlySet("paidBy")) {
                this.paidBy(model.getPaidBy());
            }
            if (model.wasPropertyExplicitlySet("amountPaid")) {
                this.amountPaid(model.getAmountPaid());
            }
            if (model.wasPropertyExplicitlySet("nameOnCard")) {
                this.nameOnCard(model.getNameOnCard());
            }
            if (model.wasPropertyExplicitlySet("creditCardType")) {
                this.creditCardType(model.getCreditCardType());
            }
            if (model.wasPropertyExplicitlySet("lastDigits")) {
                this.lastDigits(model.getLastDigits());
            }
            if (model.wasPropertyExplicitlySet("timeExpiration")) {
                this.timeExpiration(model.getTimeExpiration());
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

    @Deprecated
    public CreditCardPaymentDetail(
            java.util.Date timePaidOn,
            String paidBy,
            java.math.BigDecimal amountPaid,
            String nameOnCard,
            CreditCardType creditCardType,
            String lastDigits,
            java.util.Date timeExpiration) {
        super(timePaidOn, paidBy, amountPaid);
        this.nameOnCard = nameOnCard;
        this.creditCardType = creditCardType;
        this.lastDigits = lastDigits;
        this.timeExpiration = timeExpiration;
    }

    /** Name on the credit card */
    @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
    private final String nameOnCard;

    /**
     * Name on the credit card
     *
     * @return the value
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /** Credit card type */
    public enum CreditCardType implements com.oracle.bmc.http.internal.BmcEnum {
        Visa("VISA"),
        Amex("AMEX"),
        Mastercard("MASTERCARD"),
        Discover("DISCOVER"),
        Jcb("JCB"),
        Diner("DINER"),
        Elo("ELO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreditCardType.class);

        private final String value;
        private static java.util.Map<String, CreditCardType> map;

        static {
            map = new java.util.HashMap<>();
            for (CreditCardType v : CreditCardType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreditCardType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreditCardType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreditCardType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Credit card type */
    @com.fasterxml.jackson.annotation.JsonProperty("creditCardType")
    private final CreditCardType creditCardType;

    /**
     * Credit card type
     *
     * @return the value
     */
    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /** Last four digits of the card */
    @com.fasterxml.jackson.annotation.JsonProperty("lastDigits")
    private final String lastDigits;

    /**
     * Last four digits of the card
     *
     * @return the value
     */
    public String getLastDigits() {
        return lastDigits;
    }

    /** Expired date of the credit card */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiration")
    private final java.util.Date timeExpiration;

    /**
     * Expired date of the credit card
     *
     * @return the value
     */
    public java.util.Date getTimeExpiration() {
        return timeExpiration;
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
        sb.append("CreditCardPaymentDetail(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", nameOnCard=").append(String.valueOf(this.nameOnCard));
        sb.append(", creditCardType=").append(String.valueOf(this.creditCardType));
        sb.append(", lastDigits=").append(String.valueOf(this.lastDigits));
        sb.append(", timeExpiration=").append(String.valueOf(this.timeExpiration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreditCardPaymentDetail)) {
            return false;
        }

        CreditCardPaymentDetail other = (CreditCardPaymentDetail) o;
        return java.util.Objects.equals(this.nameOnCard, other.nameOnCard)
                && java.util.Objects.equals(this.creditCardType, other.creditCardType)
                && java.util.Objects.equals(this.lastDigits, other.lastDigits)
                && java.util.Objects.equals(this.timeExpiration, other.timeExpiration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.nameOnCard == null ? 43 : this.nameOnCard.hashCode());
        result =
                (result * PRIME)
                        + (this.creditCardType == null ? 43 : this.creditCardType.hashCode());
        result = (result * PRIME) + (this.lastDigits == null ? 43 : this.lastDigits.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpiration == null ? 43 : this.timeExpiration.hashCode());
        return result;
    }
}
