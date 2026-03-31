/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * A pricing plan rate provided by the Publisher. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PricingRate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PricingRate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currency", "rate"})
    public PricingRate(String currency, Float rate) {
        super();
        this.currency = currency;
        this.rate = rate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The currency supported, in the format specified by ISO-4217 */
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        /**
         * The currency supported, in the format specified by ISO-4217
         *
         * @param currency the value to set
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /** The amount charged for the plan in the specified currency. */
        @com.fasterxml.jackson.annotation.JsonProperty("rate")
        private Float rate;

        /**
         * The amount charged for the plan in the specified currency.
         *
         * @param rate the value to set
         * @return this builder
         */
        public Builder rate(Float rate) {
            this.rate = rate;
            this.__explicitlySet__.add("rate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PricingRate build() {
            PricingRate model = new PricingRate(this.currency, this.rate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PricingRate model) {
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("rate")) {
                this.rate(model.getRate());
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

    /** The currency supported, in the format specified by ISO-4217 */
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final String currency;

    /**
     * The currency supported, in the format specified by ISO-4217
     *
     * @return the value
     */
    public String getCurrency() {
        return currency;
    }

    /** The amount charged for the plan in the specified currency. */
    @com.fasterxml.jackson.annotation.JsonProperty("rate")
    private final Float rate;

    /**
     * The amount charged for the plan in the specified currency.
     *
     * @return the value
     */
    public Float getRate() {
        return rate;
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
        sb.append("PricingRate(");
        sb.append("super=").append(super.toString());
        sb.append("currency=").append(String.valueOf(this.currency));
        sb.append(", rate=").append(String.valueOf(this.rate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PricingRate)) {
            return false;
        }

        PricingRate other = (PricingRate) o;
        return java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.rate, other.rate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.rate == null ? 43 : this.rate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
