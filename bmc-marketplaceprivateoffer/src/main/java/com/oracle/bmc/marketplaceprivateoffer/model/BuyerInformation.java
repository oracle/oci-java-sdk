/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * The information related to the buyer of an Offer <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BuyerInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BuyerInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "companyName",
        "noteToBuyer",
        "primaryContact",
        "additionalContacts"
    })
    public BuyerInformation(
            String companyName,
            String noteToBuyer,
            Contact primaryContact,
            java.util.List<Contact> additionalContacts) {
        super();
        this.companyName = companyName;
        this.noteToBuyer = noteToBuyer;
        this.primaryContact = primaryContact;
        this.additionalContacts = additionalContacts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** the name of the company for the buyer */
        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        /**
         * the name of the company for the buyer
         *
         * @param companyName the value to set
         * @return this builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }
        /** a note the seller can specify for the buyer through a notification email */
        @com.fasterxml.jackson.annotation.JsonProperty("noteToBuyer")
        private String noteToBuyer;

        /**
         * a note the seller can specify for the buyer through a notification email
         *
         * @param noteToBuyer the value to set
         * @return this builder
         */
        public Builder noteToBuyer(String noteToBuyer) {
            this.noteToBuyer = noteToBuyer;
            this.__explicitlySet__.add("noteToBuyer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryContact")
        private Contact primaryContact;

        public Builder primaryContact(Contact primaryContact) {
            this.primaryContact = primaryContact;
            this.__explicitlySet__.add("primaryContact");
            return this;
        }
        /** the additional contacts associated with the buyer */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalContacts")
        private java.util.List<Contact> additionalContacts;

        /**
         * the additional contacts associated with the buyer
         *
         * @param additionalContacts the value to set
         * @return this builder
         */
        public Builder additionalContacts(java.util.List<Contact> additionalContacts) {
            this.additionalContacts = additionalContacts;
            this.__explicitlySet__.add("additionalContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuyerInformation build() {
            BuyerInformation model =
                    new BuyerInformation(
                            this.companyName,
                            this.noteToBuyer,
                            this.primaryContact,
                            this.additionalContacts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuyerInformation model) {
            if (model.wasPropertyExplicitlySet("companyName")) {
                this.companyName(model.getCompanyName());
            }
            if (model.wasPropertyExplicitlySet("noteToBuyer")) {
                this.noteToBuyer(model.getNoteToBuyer());
            }
            if (model.wasPropertyExplicitlySet("primaryContact")) {
                this.primaryContact(model.getPrimaryContact());
            }
            if (model.wasPropertyExplicitlySet("additionalContacts")) {
                this.additionalContacts(model.getAdditionalContacts());
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

    /** the name of the company for the buyer */
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    private final String companyName;

    /**
     * the name of the company for the buyer
     *
     * @return the value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** a note the seller can specify for the buyer through a notification email */
    @com.fasterxml.jackson.annotation.JsonProperty("noteToBuyer")
    private final String noteToBuyer;

    /**
     * a note the seller can specify for the buyer through a notification email
     *
     * @return the value
     */
    public String getNoteToBuyer() {
        return noteToBuyer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("primaryContact")
    private final Contact primaryContact;

    public Contact getPrimaryContact() {
        return primaryContact;
    }

    /** the additional contacts associated with the buyer */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalContacts")
    private final java.util.List<Contact> additionalContacts;

    /**
     * the additional contacts associated with the buyer
     *
     * @return the value
     */
    public java.util.List<Contact> getAdditionalContacts() {
        return additionalContacts;
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
        sb.append("BuyerInformation(");
        sb.append("super=").append(super.toString());
        sb.append("companyName=").append(String.valueOf(this.companyName));
        sb.append(", noteToBuyer=").append(String.valueOf(this.noteToBuyer));
        sb.append(", primaryContact=").append(String.valueOf(this.primaryContact));
        sb.append(", additionalContacts=").append(String.valueOf(this.additionalContacts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuyerInformation)) {
            return false;
        }

        BuyerInformation other = (BuyerInformation) o;
        return java.util.Objects.equals(this.companyName, other.companyName)
                && java.util.Objects.equals(this.noteToBuyer, other.noteToBuyer)
                && java.util.Objects.equals(this.primaryContact, other.primaryContact)
                && java.util.Objects.equals(this.additionalContacts, other.additionalContacts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.companyName == null ? 43 : this.companyName.hashCode());
        result = (result * PRIME) + (this.noteToBuyer == null ? 43 : this.noteToBuyer.hashCode());
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
