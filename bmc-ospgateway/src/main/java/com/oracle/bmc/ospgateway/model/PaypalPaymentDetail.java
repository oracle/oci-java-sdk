/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * PayPal Payment related details <br>
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
        builder = PaypalPaymentDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "paymentMethod")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PaypalPaymentDetail extends PaymentDetail {
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
        /** The id (email address) of the paypal payment */
        @com.fasterxml.jackson.annotation.JsonProperty("paypalId")
        private String paypalId;

        /**
         * The id (email address) of the paypal payment
         *
         * @param paypalId the value to set
         * @return this builder
         */
        public Builder paypalId(String paypalId) {
            this.paypalId = paypalId;
            this.__explicitlySet__.add("paypalId");
            return this;
        }
        /** paypal payment reference */
        @com.fasterxml.jackson.annotation.JsonProperty("paypalReference")
        private String paypalReference;

        /**
         * paypal payment reference
         *
         * @param paypalReference the value to set
         * @return this builder
         */
        public Builder paypalReference(String paypalReference) {
            this.paypalReference = paypalReference;
            this.__explicitlySet__.add("paypalReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PaypalPaymentDetail build() {
            PaypalPaymentDetail model =
                    new PaypalPaymentDetail(
                            this.timePaidOn,
                            this.paidBy,
                            this.amountPaid,
                            this.paypalId,
                            this.paypalReference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PaypalPaymentDetail model) {
            if (model.wasPropertyExplicitlySet("timePaidOn")) {
                this.timePaidOn(model.getTimePaidOn());
            }
            if (model.wasPropertyExplicitlySet("paidBy")) {
                this.paidBy(model.getPaidBy());
            }
            if (model.wasPropertyExplicitlySet("amountPaid")) {
                this.amountPaid(model.getAmountPaid());
            }
            if (model.wasPropertyExplicitlySet("paypalId")) {
                this.paypalId(model.getPaypalId());
            }
            if (model.wasPropertyExplicitlySet("paypalReference")) {
                this.paypalReference(model.getPaypalReference());
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
    public PaypalPaymentDetail(
            java.util.Date timePaidOn,
            String paidBy,
            java.math.BigDecimal amountPaid,
            String paypalId,
            String paypalReference) {
        super(timePaidOn, paidBy, amountPaid);
        this.paypalId = paypalId;
        this.paypalReference = paypalReference;
    }

    /** The id (email address) of the paypal payment */
    @com.fasterxml.jackson.annotation.JsonProperty("paypalId")
    private final String paypalId;

    /**
     * The id (email address) of the paypal payment
     *
     * @return the value
     */
    public String getPaypalId() {
        return paypalId;
    }

    /** paypal payment reference */
    @com.fasterxml.jackson.annotation.JsonProperty("paypalReference")
    private final String paypalReference;

    /**
     * paypal payment reference
     *
     * @return the value
     */
    public String getPaypalReference() {
        return paypalReference;
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
        sb.append("PaypalPaymentDetail(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", paypalId=").append(String.valueOf(this.paypalId));
        sb.append(", paypalReference=").append(String.valueOf(this.paypalReference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaypalPaymentDetail)) {
            return false;
        }

        PaypalPaymentDetail other = (PaypalPaymentDetail) o;
        return java.util.Objects.equals(this.paypalId, other.paypalId)
                && java.util.Objects.equals(this.paypalReference, other.paypalReference)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.paypalId == null ? 43 : this.paypalId.hashCode());
        result =
                (result * PRIME)
                        + (this.paypalReference == null ? 43 : this.paypalReference.hashCode());
        return result;
    }
}
