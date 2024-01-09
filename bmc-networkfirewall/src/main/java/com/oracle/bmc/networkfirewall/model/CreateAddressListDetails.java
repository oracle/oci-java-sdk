/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * The Request for creating the address List <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAddressListDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAddressListDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "addresses"})
    public CreateAddressListDetails(
            String name, AddressListType type, java.util.List<String> addresses) {
        super();
        this.name = name;
        this.type = type;
        this.addresses = addresses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique name to identify the group of addresses to be used in the policy rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name to identify the group of addresses to be used in the policy rules.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Type of address List. The accepted values are - * FQDN * IP */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AddressListType type;

        /**
         * Type of address List. The accepted values are - * FQDN * IP
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(AddressListType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** List of addresses. */
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        /**
         * List of addresses.
         *
         * @param addresses the value to set
         * @return this builder
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAddressListDetails build() {
            CreateAddressListDetails model =
                    new CreateAddressListDetails(this.name, this.type, this.addresses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAddressListDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("addresses")) {
                this.addresses(model.getAddresses());
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

    /** Unique name to identify the group of addresses to be used in the policy rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name to identify the group of addresses to be used in the policy rules.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Type of address List. The accepted values are - * FQDN * IP */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AddressListType type;

    /**
     * Type of address List. The accepted values are - * FQDN * IP
     *
     * @return the value
     */
    public AddressListType getType() {
        return type;
    }

    /** List of addresses. */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<String> addresses;

    /**
     * List of addresses.
     *
     * @return the value
     */
    public java.util.List<String> getAddresses() {
        return addresses;
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
        sb.append("CreateAddressListDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", addresses=").append(String.valueOf(this.addresses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAddressListDetails)) {
            return false;
        }

        CreateAddressListDetails other = (CreateAddressListDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.addresses, other.addresses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
