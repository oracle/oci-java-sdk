/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Private Offer account details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivateOfferAccountDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateOfferAccountDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"meter", "sku"})
    public PrivateOfferAccountDetails(String meter, String sku) {
        super();
        this.meter = meter;
        this.sku = sku;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Meter name */
        @com.fasterxml.jackson.annotation.JsonProperty("meter")
        private String meter;

        /**
         * Meter name
         *
         * @param meter the value to set
         * @return this builder
         */
        public Builder meter(String meter) {
            this.meter = meter;
            this.__explicitlySet__.add("meter");
            return this;
        }
        /** SKU name */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * SKU name
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateOfferAccountDetails build() {
            PrivateOfferAccountDetails model = new PrivateOfferAccountDetails(this.meter, this.sku);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateOfferAccountDetails model) {
            if (model.wasPropertyExplicitlySet("meter")) {
                this.meter(model.getMeter());
            }
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
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

    /** Meter name */
    @com.fasterxml.jackson.annotation.JsonProperty("meter")
    private final String meter;

    /**
     * Meter name
     *
     * @return the value
     */
    public String getMeter() {
        return meter;
    }

    /** SKU name */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * SKU name
     *
     * @return the value
     */
    public String getSku() {
        return sku;
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
        sb.append("PrivateOfferAccountDetails(");
        sb.append("super=").append(super.toString());
        sb.append("meter=").append(String.valueOf(this.meter));
        sb.append(", sku=").append(String.valueOf(this.sku));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateOfferAccountDetails)) {
            return false;
        }

        PrivateOfferAccountDetails other = (PrivateOfferAccountDetails) o;
        return java.util.Objects.equals(this.meter, other.meter)
                && java.util.Objects.equals(this.sku, other.sku)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.meter == null ? 43 : this.meter.hashCode());
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
