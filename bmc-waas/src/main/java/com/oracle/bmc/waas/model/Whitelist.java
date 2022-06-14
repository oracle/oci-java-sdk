/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * An array of IP addresses that bypass the Web Application Firewall. Supports both single IP addresses or subnet masks (CIDR notation).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Whitelist.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Whitelist {
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
        /**
         * The unique name of the whitelist.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the whitelist.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A set of IP addresses or CIDR notations to include in the whitelist.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        /**
         * A set of IP addresses or CIDR notations to include in the whitelist.
         * @param addresses the value to set
         * @return this builder
         **/
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }
        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address lists to include in the whitelist.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addressLists")
        private java.util.List<String> addressLists;

        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address lists to include in the whitelist.
         * @param addressLists the value to set
         * @return this builder
         **/
        public Builder addressLists(java.util.List<String> addressLists) {
            this.addressLists = addressLists;
            this.__explicitlySet__.add("addressLists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Whitelist build() {
            Whitelist __instance__ = new Whitelist(name, addresses, addressLists);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Whitelist o) {
            Builder copiedBuilder =
                    name(o.getName()).addresses(o.getAddresses()).addressLists(o.getAddressLists());

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

    /**
     * The unique name of the whitelist.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the whitelist.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A set of IP addresses or CIDR notations to include in the whitelist.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<String> addresses;

    /**
     * A set of IP addresses or CIDR notations to include in the whitelist.
     * @return the value
     **/
    public java.util.List<String> getAddresses() {
        return addresses;
    }

    /**
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address lists to include in the whitelist.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLists")
    private final java.util.List<String> addressLists;

    /**
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of IP address lists to include in the whitelist.
     * @return the value
     **/
    public java.util.List<String> getAddressLists() {
        return addressLists;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Whitelist(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", addresses=").append(String.valueOf(this.addresses));
        sb.append(", addressLists=").append(String.valueOf(this.addressLists));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
        result = (result * PRIME) + (this.addressLists == null ? 43 : this.addressLists.hashCode());
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
