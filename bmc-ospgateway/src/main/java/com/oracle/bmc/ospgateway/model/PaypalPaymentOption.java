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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PaypalPaymentOption.Builder.class
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
public class PaypalPaymentOption extends PaymentOption {
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
    String emailAddress;

    /**
     * First name of the paypal user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    String firstName;

    /**
     * Last name of the paypal user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    String lastName;

    /**
     * Agreement id for the paypal account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extBillingAgreementId")
    String extBillingAgreementId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
