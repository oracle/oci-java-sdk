/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * The information related to the seller of an Offer
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SellerInformation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SellerInformation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"primaryContact", "additionalContacts"})
    public SellerInformation(Contact primaryContact, java.util.List<Contact> additionalContacts) {
        super();
        this.primaryContact = primaryContact;
        this.additionalContacts = additionalContacts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("primaryContact")
        private Contact primaryContact;

        public Builder primaryContact(Contact primaryContact) {
            this.primaryContact = primaryContact;
            this.__explicitlySet__.add("primaryContact");
            return this;
        }
        /**
         * the additional contacts associated with the seller
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalContacts")
        private java.util.List<Contact> additionalContacts;

        /**
         * the additional contacts associated with the seller
         * @param additionalContacts the value to set
         * @return this builder
         **/
        public Builder additionalContacts(java.util.List<Contact> additionalContacts) {
            this.additionalContacts = additionalContacts;
            this.__explicitlySet__.add("additionalContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SellerInformation build() {
            SellerInformation model =
                    new SellerInformation(this.primaryContact, this.additionalContacts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SellerInformation model) {
            if (model.wasPropertyExplicitlySet("primaryContact")) {
                this.primaryContact(model.getPrimaryContact());
            }
            if (model.wasPropertyExplicitlySet("additionalContacts")) {
                this.additionalContacts(model.getAdditionalContacts());
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

    @com.fasterxml.jackson.annotation.JsonProperty("primaryContact")
    private final Contact primaryContact;

    public Contact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * the additional contacts associated with the seller
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalContacts")
    private final java.util.List<Contact> additionalContacts;

    /**
     * the additional contacts associated with the seller
     * @return the value
     **/
    public java.util.List<Contact> getAdditionalContacts() {
        return additionalContacts;
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
        sb.append("SellerInformation(");
        sb.append("super=").append(super.toString());
        sb.append("primaryContact=").append(String.valueOf(this.primaryContact));
        sb.append(", additionalContacts=").append(String.valueOf(this.additionalContacts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SellerInformation)) {
            return false;
        }

        SellerInformation other = (SellerInformation) o;
        return java.util.Objects.equals(this.primaryContact, other.primaryContact)
                && java.util.Objects.equals(this.additionalContacts, other.additionalContacts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.primaryContact == null ? 43 : this.primaryContact.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalContacts == null
                                ? 43
                                : this.additionalContacts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
