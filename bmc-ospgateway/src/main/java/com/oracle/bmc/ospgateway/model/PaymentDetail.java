/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Payment related details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "paymentMethod",
    defaultImpl = PaymentDetail.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OtherPaymentDetail.class,
        name = "OTHER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PaypalPaymentDetail.class,
        name = "PAYPAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreditCardPaymentDetail.class,
        name = "CREDIT_CARD"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PaymentDetail extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timePaidOn", "paidBy", "amountPaid"})
    protected PaymentDetail(
            java.util.Date timePaidOn, String paidBy, java.math.BigDecimal amountPaid) {
        super();
        this.timePaidOn = timePaidOn;
        this.paidBy = paidBy;
        this.amountPaid = amountPaid;
    }

    /**
     * Paid the invoice on this day
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePaidOn")
    private final java.util.Date timePaidOn;

    /**
     * Paid the invoice on this day
     * @return the value
     **/
    public java.util.Date getTimePaidOn() {
        return timePaidOn;
    }

    /**
     * example
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paidBy")
    private final String paidBy;

    /**
     * example
     * @return the value
     **/
    public String getPaidBy() {
        return paidBy;
    }

    /**
     * Amount that paid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amountPaid")
    private final java.math.BigDecimal amountPaid;

    /**
     * Amount that paid
     * @return the value
     **/
    public java.math.BigDecimal getAmountPaid() {
        return amountPaid;
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
        sb.append("PaymentDetail(");
        sb.append("super=").append(super.toString());
        sb.append("timePaidOn=").append(String.valueOf(this.timePaidOn));
        sb.append(", paidBy=").append(String.valueOf(this.paidBy));
        sb.append(", amountPaid=").append(String.valueOf(this.amountPaid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaymentDetail)) {
            return false;
        }

        PaymentDetail other = (PaymentDetail) o;
        return java.util.Objects.equals(this.timePaidOn, other.timePaidOn)
                && java.util.Objects.equals(this.paidBy, other.paidBy)
                && java.util.Objects.equals(this.amountPaid, other.amountPaid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timePaidOn == null ? 43 : this.timePaidOn.hashCode());
        result = (result * PRIME) + (this.paidBy == null ? 43 : this.paidBy.hashCode());
        result = (result * PRIME) + (this.amountPaid == null ? 43 : this.amountPaid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Payment method
     **/
    public enum PaymentMethod {
        CreditCard("CREDIT_CARD"),
        Paypal("PAYPAL"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PaymentMethod.class);

        private final String value;
        private static java.util.Map<String, PaymentMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (PaymentMethod v : PaymentMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PaymentMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PaymentMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PaymentMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
