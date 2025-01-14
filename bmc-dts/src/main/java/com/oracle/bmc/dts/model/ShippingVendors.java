/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShippingVendors.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShippingVendors
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vendors"})
    public ShippingVendors(java.util.List<String> vendors) {
        super();
        this.vendors = vendors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of available shipping vendors for package delivery */
        @com.fasterxml.jackson.annotation.JsonProperty("vendors")
        private java.util.List<String> vendors;

        /**
         * List of available shipping vendors for package delivery
         *
         * @param vendors the value to set
         * @return this builder
         */
        public Builder vendors(java.util.List<String> vendors) {
            this.vendors = vendors;
            this.__explicitlySet__.add("vendors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShippingVendors build() {
            ShippingVendors model = new ShippingVendors(this.vendors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShippingVendors model) {
            if (model.wasPropertyExplicitlySet("vendors")) {
                this.vendors(model.getVendors());
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

    /** List of available shipping vendors for package delivery */
    @com.fasterxml.jackson.annotation.JsonProperty("vendors")
    private final java.util.List<String> vendors;

    /**
     * List of available shipping vendors for package delivery
     *
     * @return the value
     */
    public java.util.List<String> getVendors() {
        return vendors;
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
        sb.append("ShippingVendors(");
        sb.append("super=").append(super.toString());
        sb.append("vendors=").append(String.valueOf(this.vendors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShippingVendors)) {
            return false;
        }

        ShippingVendors other = (ShippingVendors) o;
        return java.util.Objects.equals(this.vendors, other.vendors) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vendors == null ? 43 : this.vendors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
