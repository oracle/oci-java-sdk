/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Rate Card Tier details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RateCardTier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RateCardTier extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"upToQuantity", "netUnitPrice", "overagePrice"})
    public RateCardTier(String upToQuantity, String netUnitPrice, String overagePrice) {
        super();
        this.upToQuantity = upToQuantity;
        this.netUnitPrice = netUnitPrice;
        this.overagePrice = overagePrice;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Rate card tier quantity range
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upToQuantity")
        private String upToQuantity;

        /**
         * Rate card tier quantity range
         *
         * @param upToQuantity the value to set
         * @return this builder
         **/
        public Builder upToQuantity(String upToQuantity) {
            this.upToQuantity = upToQuantity;
            this.__explicitlySet__.add("upToQuantity");
            return this;
        }
        /**
         * Rate card tier net unit price
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Rate card tier net unit price
         *
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Rate card tier overage price
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
        private String overagePrice;

        /**
         * Rate card tier overage price
         *
         * @param overagePrice the value to set
         * @return this builder
         **/
        public Builder overagePrice(String overagePrice) {
            this.overagePrice = overagePrice;
            this.__explicitlySet__.add("overagePrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RateCardTier build() {
            RateCardTier model =
                    new RateCardTier(this.upToQuantity, this.netUnitPrice, this.overagePrice);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RateCardTier model) {
            if (model.wasPropertyExplicitlySet("upToQuantity")) {
                this.upToQuantity(model.getUpToQuantity());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("overagePrice")) {
                this.overagePrice(model.getOveragePrice());
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

    /**
     * Rate card tier quantity range
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upToQuantity")
    private final String upToQuantity;

    /**
     * Rate card tier quantity range
     *
     * @return the value
     **/
    public String getUpToQuantity() {
        return upToQuantity;
    }

    /**
     * Rate card tier net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Rate card tier net unit price
     *
     * @return the value
     **/
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Rate card tier overage price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagePrice")
    private final String overagePrice;

    /**
     * Rate card tier overage price
     *
     * @return the value
     **/
    public String getOveragePrice() {
        return overagePrice;
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
        sb.append("RateCardTier(");
        sb.append("super=").append(super.toString());
        sb.append("upToQuantity=").append(String.valueOf(this.upToQuantity));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", overagePrice=").append(String.valueOf(this.overagePrice));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RateCardTier)) {
            return false;
        }

        RateCardTier other = (RateCardTier) o;
        return java.util.Objects.equals(this.upToQuantity, other.upToQuantity)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.overagePrice, other.overagePrice)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.upToQuantity == null ? 43 : this.upToQuantity.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.overagePrice == null ? 43 : this.overagePrice.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
