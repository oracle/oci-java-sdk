/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Echeck Payment related details <br>
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
        builder = EcheckPaymentDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "paymentMethod")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EcheckPaymentDetail extends PaymentDetail {
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
        /** Name on the echeck card */
        @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
        private String nameOnCard;

        /**
         * Name on the echeck card
         *
         * @param nameOnCard the value to set
         * @return this builder
         */
        public Builder nameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            this.__explicitlySet__.add("nameOnCard");
            return this;
        }
        /** Echeck card type */
        @com.fasterxml.jackson.annotation.JsonProperty("cardType")
        private CardType cardType;

        /**
         * Echeck card type
         *
         * @param cardType the value to set
         * @return this builder
         */
        public Builder cardType(CardType cardType) {
            this.cardType = cardType;
            this.__explicitlySet__.add("cardType");
            return this;
        }
        /** Account number of the card owner */
        @com.fasterxml.jackson.annotation.JsonProperty("accountNumber")
        private String accountNumber;

        /**
         * Account number of the card owner
         *
         * @param accountNumber the value to set
         * @return this builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            this.__explicitlySet__.add("accountNumber");
            return this;
        }
        /** Routing number of the echeck card */
        @com.fasterxml.jackson.annotation.JsonProperty("routingNumber")
        private String routingNumber;

        /**
         * Routing number of the echeck card
         *
         * @param routingNumber the value to set
         * @return this builder
         */
        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            this.__explicitlySet__.add("routingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EcheckPaymentDetail build() {
            EcheckPaymentDetail model =
                    new EcheckPaymentDetail(
                            this.timePaidOn,
                            this.paidBy,
                            this.amountPaid,
                            this.nameOnCard,
                            this.cardType,
                            this.accountNumber,
                            this.routingNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EcheckPaymentDetail model) {
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
            if (model.wasPropertyExplicitlySet("cardType")) {
                this.cardType(model.getCardType());
            }
            if (model.wasPropertyExplicitlySet("accountNumber")) {
                this.accountNumber(model.getAccountNumber());
            }
            if (model.wasPropertyExplicitlySet("routingNumber")) {
                this.routingNumber(model.getRoutingNumber());
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
    public EcheckPaymentDetail(
            java.util.Date timePaidOn,
            String paidBy,
            java.math.BigDecimal amountPaid,
            String nameOnCard,
            CardType cardType,
            String accountNumber,
            String routingNumber) {
        super(timePaidOn, paidBy, amountPaid);
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    /** Name on the echeck card */
    @com.fasterxml.jackson.annotation.JsonProperty("nameOnCard")
    private final String nameOnCard;

    /**
     * Name on the echeck card
     *
     * @return the value
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /** Echeck card type */
    public enum CardType implements com.oracle.bmc.http.internal.BmcEnum {
        Saving("SAVING"),
        Checking("CHECKING"),
        CorporateChecking("CORPORATE_CHECKING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CardType.class);

        private final String value;
        private static java.util.Map<String, CardType> map;

        static {
            map = new java.util.HashMap<>();
            for (CardType v : CardType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CardType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CardType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CardType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Echeck card type */
    @com.fasterxml.jackson.annotation.JsonProperty("cardType")
    private final CardType cardType;

    /**
     * Echeck card type
     *
     * @return the value
     */
    public CardType getCardType() {
        return cardType;
    }

    /** Account number of the card owner */
    @com.fasterxml.jackson.annotation.JsonProperty("accountNumber")
    private final String accountNumber;

    /**
     * Account number of the card owner
     *
     * @return the value
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Routing number of the echeck card */
    @com.fasterxml.jackson.annotation.JsonProperty("routingNumber")
    private final String routingNumber;

    /**
     * Routing number of the echeck card
     *
     * @return the value
     */
    public String getRoutingNumber() {
        return routingNumber;
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
        sb.append("EcheckPaymentDetail(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", nameOnCard=").append(String.valueOf(this.nameOnCard));
        sb.append(", cardType=").append(String.valueOf(this.cardType));
        sb.append(", accountNumber=").append(String.valueOf(this.accountNumber));
        sb.append(", routingNumber=").append(String.valueOf(this.routingNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EcheckPaymentDetail)) {
            return false;
        }

        EcheckPaymentDetail other = (EcheckPaymentDetail) o;
        return java.util.Objects.equals(this.nameOnCard, other.nameOnCard)
                && java.util.Objects.equals(this.cardType, other.cardType)
                && java.util.Objects.equals(this.accountNumber, other.accountNumber)
                && java.util.Objects.equals(this.routingNumber, other.routingNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.nameOnCard == null ? 43 : this.nameOnCard.hashCode());
        result = (result * PRIME) + (this.cardType == null ? 43 : this.cardType.hashCode());
        result =
                (result * PRIME)
                        + (this.accountNumber == null ? 43 : this.accountNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.routingNumber == null ? 43 : this.routingNumber.hashCode());
        return result;
    }
}
