/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * PayPal Payment related details
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
    builder = PaypalPaymentOption.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "paymentMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PaypalPaymentOption extends PaymentOption {
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

        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extBillingAgreementId")
        private String extBillingAgreementId;

        public Builder extBillingAgreementId(String extBillingAgreementId) {
            this.extBillingAgreementId = extBillingAgreementId;
            this.__explicitlySet__.add("extBillingAgreementId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PaypalPaymentOption build() {
            PaypalPaymentOption __instance__ =
                    new PaypalPaymentOption(
                            walletInstrumentId,
                            walletTransactionId,
                            emailAddress,
                            firstName,
                            lastName,
                            extBillingAgreementId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PaypalPaymentOption o) {
            Builder copiedBuilder =
                    walletInstrumentId(o.getWalletInstrumentId())
                            .walletTransactionId(o.getWalletTransactionId())
                            .emailAddress(o.getEmailAddress())
                            .firstName(o.getFirstName())
                            .lastName(o.getLastName())
                            .extBillingAgreementId(o.getExtBillingAgreementId());

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
    public PaypalPaymentOption(
            String walletInstrumentId,
            String walletTransactionId,
            String emailAddress,
            String firstName,
            String lastName,
            String extBillingAgreementId) {
        super(walletInstrumentId, walletTransactionId);
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.extBillingAgreementId = extBillingAgreementId;
    }

    /**
     * The email address of the paypal user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * First name of the paypal user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    public String getFirstName() {
        return firstName;
    }

    /**
     * Last name of the paypal user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    public String getLastName() {
        return lastName;
    }

    /**
     * Agreement id for the paypal account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extBillingAgreementId")
    private final String extBillingAgreementId;

    public String getExtBillingAgreementId() {
        return extBillingAgreementId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PaypalPaymentOption(");
        sb.append("super=").append(super.toString());
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", extBillingAgreementId=").append(String.valueOf(this.extBillingAgreementId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaypalPaymentOption)) {
            return false;
        }

        PaypalPaymentOption other = (PaypalPaymentOption) o;
        return java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.extBillingAgreementId, other.extBillingAgreementId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result =
                (result * PRIME)
                        + (this.extBillingAgreementId == null
                                ? 43
                                : this.extBillingAgreementId.hashCode());
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
