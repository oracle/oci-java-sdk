/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Addres rule information
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddressRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddressRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"countryCode", "address", "contact", "tax"})
    public AddressRule(
            String countryCode, AddressTypeRule address, ContactTypeRule contact, TaxTypeRule tax) {
        super();
        this.countryCode = countryCode;
        this.address = address;
        this.contact = contact;
        this.tax = tax;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Country code for the address rule in ISO-3166-1 2-letter format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * Country code for the address rule in ISO-3166-1 2-letter format
         * @param countryCode the value to set
         * @return this builder
         **/
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private AddressTypeRule address;

        public Builder address(AddressTypeRule address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contact")
        private ContactTypeRule contact;

        public Builder contact(ContactTypeRule contact) {
            this.contact = contact;
            this.__explicitlySet__.add("contact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tax")
        private TaxTypeRule tax;

        public Builder tax(TaxTypeRule tax) {
            this.tax = tax;
            this.__explicitlySet__.add("tax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddressRule build() {
            AddressRule model =
                    new AddressRule(this.countryCode, this.address, this.contact, this.tax);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressRule model) {
            if (model.wasPropertyExplicitlySet("countryCode")) {
                this.countryCode(model.getCountryCode());
            }
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("contact")) {
                this.contact(model.getContact());
            }
            if (model.wasPropertyExplicitlySet("tax")) {
                this.tax(model.getTax());
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
     * Country code for the address rule in ISO-3166-1 2-letter format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * Country code for the address rule in ISO-3166-1 2-letter format
     * @return the value
     **/
    public String getCountryCode() {
        return countryCode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final AddressTypeRule address;

    public AddressTypeRule getAddress() {
        return address;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    private final ContactTypeRule contact;

    public ContactTypeRule getContact() {
        return contact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tax")
    private final TaxTypeRule tax;

    public TaxTypeRule getTax() {
        return tax;
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
        sb.append("AddressRule(");
        sb.append("super=").append(super.toString());
        sb.append("countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", address=").append(String.valueOf(this.address));
        sb.append(", contact=").append(String.valueOf(this.contact));
        sb.append(", tax=").append(String.valueOf(this.tax));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddressRule)) {
            return false;
        }

        AddressRule other = (AddressRule) o;
        return java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.contact, other.contact)
                && java.util.Objects.equals(this.tax, other.tax)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.contact == null ? 43 : this.contact.hashCode());
        result = (result * PRIME) + (this.tax == null ? 43 : this.tax.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
