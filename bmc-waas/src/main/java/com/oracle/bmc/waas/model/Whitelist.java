/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * An array of IP addresses that bypass the Web Application Firewall. Supports both single IP
 * addresses or subnet masks (CIDR notation). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Whitelist.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Whitelist extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "addresses", "addressLists"})
    public Whitelist(
            String name, java.util.List<String> addresses, java.util.List<String> addressLists) {
        super();
        this.name = name;
        this.addresses = addresses;
        this.addressLists = addressLists;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique name of the whitelist. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the whitelist.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A set of IP addresses or CIDR notations to include in the whitelist. */
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        /**
         * A set of IP addresses or CIDR notations to include in the whitelist.
         *
         * @param addresses the value to set
         * @return this builder
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }
        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP
         * address lists to include in the whitelist.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("addressLists")
        private java.util.List<String> addressLists;

        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP
         * address lists to include in the whitelist.
         *
         * @param addressLists the value to set
         * @return this builder
         */
        public Builder addressLists(java.util.List<String> addressLists) {
            this.addressLists = addressLists;
            this.__explicitlySet__.add("addressLists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Whitelist build() {
            Whitelist model = new Whitelist(this.name, this.addresses, this.addressLists);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Whitelist model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("addresses")) {
                this.addresses(model.getAddresses());
            }
            if (model.wasPropertyExplicitlySet("addressLists")) {
                this.addressLists(model.getAddressLists());
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

    /** The unique name of the whitelist. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the whitelist.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A set of IP addresses or CIDR notations to include in the whitelist. */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<String> addresses;

    /**
     * A set of IP addresses or CIDR notations to include in the whitelist.
     *
     * @return the value
     */
    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address
     * lists to include in the whitelist.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressLists")
    private final java.util.List<String> addressLists;

    /**
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address
     * lists to include in the whitelist.
     *
     * @return the value
     */
    public java.util.List<String> getAddressLists() {
        return addressLists;
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
        sb.append("Whitelist(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", addresses=").append(String.valueOf(this.addresses));
        sb.append(", addressLists=").append(String.valueOf(this.addressLists));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Whitelist)) {
            return false;
        }

        Whitelist other = (Whitelist) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.addresses, other.addresses)
                && java.util.Objects.equals(this.addressLists, other.addressLists)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
        result = (result * PRIME) + (this.addressLists == null ? 43 : this.addressLists.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
