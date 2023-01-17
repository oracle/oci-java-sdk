/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * A single subscription SKU. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sku.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Sku extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"number", "name", "quantity"})
    public Sku(String number, String name, Integer quantity) {
        super();
        this.number = number;
        this.name = name;
        this.quantity = quantity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SKU number. */
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private String number;

        /**
         * SKU number.
         *
         * @param number the value to set
         * @return this builder
         */
        public Builder number(String number) {
            this.number = number;
            this.__explicitlySet__.add("number");
            return this;
        }
        /** SKU name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * SKU name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** SKU quantity. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Integer quantity;

        /**
         * SKU quantity.
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Sku build() {
            Sku model = new Sku(this.number, this.name, this.quantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sku model) {
            if (model.wasPropertyExplicitlySet("number")) {
                this.number(model.getNumber());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
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

    /** SKU number. */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    private final String number;

    /**
     * SKU number.
     *
     * @return the value
     */
    public String getNumber() {
        return number;
    }

    /** SKU name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * SKU name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** SKU quantity. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Integer quantity;

    /**
     * SKU quantity.
     *
     * @return the value
     */
    public Integer getQuantity() {
        return quantity;
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
        sb.append("Sku(");
        sb.append("super=").append(super.toString());
        sb.append("number=").append(String.valueOf(this.number));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sku)) {
            return false;
        }

        Sku other = (Sku) o;
        return java.util.Objects.equals(this.number, other.number)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.number == null ? 43 : this.number.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
