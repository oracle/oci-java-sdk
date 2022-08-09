/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Payment option of a subscription.
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
    defaultImpl = PaymentOption.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreditCardPaymentOption.class,
        name = "CREDIT_CARD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PaypalPaymentOption.class,
        name = "PAYPAL"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PaymentOption extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"walletInstrumentId", "walletTransactionId"})
    protected PaymentOption(String walletInstrumentId, String walletTransactionId) {
        super();
        this.walletInstrumentId = walletInstrumentId;
        this.walletTransactionId = walletTransactionId;
    }

    /**
     * Wallet instrument internal id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("walletInstrumentId")
    private final String walletInstrumentId;

    /**
     * Wallet instrument internal id.
     * @return the value
     **/
    public String getWalletInstrumentId() {
        return walletInstrumentId;
    }

    /**
     * Wallet transaction id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("walletTransactionId")
    private final String walletTransactionId;

    /**
     * Wallet transaction id.
     * @return the value
     **/
    public String getWalletTransactionId() {
        return walletTransactionId;
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
        sb.append("PaymentOption(");
        sb.append("super=").append(super.toString());
        sb.append("walletInstrumentId=").append(String.valueOf(this.walletInstrumentId));
        sb.append(", walletTransactionId=").append(String.valueOf(this.walletTransactionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaymentOption)) {
            return false;
        }

        PaymentOption other = (PaymentOption) o;
        return java.util.Objects.equals(this.walletInstrumentId, other.walletInstrumentId)
                && java.util.Objects.equals(this.walletTransactionId, other.walletTransactionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.walletInstrumentId == null
                                ? 43
                                : this.walletInstrumentId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletTransactionId == null
                                ? 43
                                : this.walletTransactionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
