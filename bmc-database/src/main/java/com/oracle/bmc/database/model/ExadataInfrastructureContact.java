/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Contact details for Exadata Infrastructure.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataInfrastructureContact.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInfrastructureContact
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "phoneNumber",
        "email",
        "isPrimary",
        "isContactMosValidated"
    })
    public ExadataInfrastructureContact(
            String name,
            String phoneNumber,
            String email,
            Boolean isPrimary,
            Boolean isContactMosValidated) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isPrimary = isPrimary;
        this.isContactMosValidated = isContactMosValidated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Exadata Infrastructure contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Exadata Infrastructure contact.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The phone number for the Exadata Infrastructure contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        /**
         * The phone number for the Exadata Infrastructure contact.
         * @param phoneNumber the value to set
         * @return this builder
         **/
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }
        /**
         * The email for the Exadata Infrastructure contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The email for the Exadata Infrastructure contact.
         * @param email the value to set
         * @return this builder
         **/
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /**
         * If {@code true}, this Exadata Infrastructure contact is a primary contact. If {@code false}, this Exadata Infrastructure is a secondary contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * If {@code true}, this Exadata Infrastructure contact is a primary contact. If {@code false}, this Exadata Infrastructure is a secondary contact.
         * @param isPrimary the value to set
         * @return this builder
         **/
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }
        /**
         * If {@code true}, this Exadata Infrastructure contact is a valid My Oracle Support (MOS) contact. If {@code false}, this Exadata Infrastructure contact is not a valid MOS contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isContactMosValidated")
        private Boolean isContactMosValidated;

        /**
         * If {@code true}, this Exadata Infrastructure contact is a valid My Oracle Support (MOS) contact. If {@code false}, this Exadata Infrastructure contact is not a valid MOS contact.
         * @param isContactMosValidated the value to set
         * @return this builder
         **/
        public Builder isContactMosValidated(Boolean isContactMosValidated) {
            this.isContactMosValidated = isContactMosValidated;
            this.__explicitlySet__.add("isContactMosValidated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInfrastructureContact build() {
            ExadataInfrastructureContact model =
                    new ExadataInfrastructureContact(
                            this.name,
                            this.phoneNumber,
                            this.email,
                            this.isPrimary,
                            this.isContactMosValidated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInfrastructureContact model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("isContactMosValidated")) {
                this.isContactMosValidated(model.getIsContactMosValidated());
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
     * The name of the Exadata Infrastructure contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Exadata Infrastructure contact.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The phone number for the Exadata Infrastructure contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    /**
     * The phone number for the Exadata Infrastructure contact.
     * @return the value
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The email for the Exadata Infrastructure contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The email for the Exadata Infrastructure contact.
     * @return the value
     **/
    public String getEmail() {
        return email;
    }

    /**
     * If {@code true}, this Exadata Infrastructure contact is a primary contact. If {@code false}, this Exadata Infrastructure is a secondary contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * If {@code true}, this Exadata Infrastructure contact is a primary contact. If {@code false}, this Exadata Infrastructure is a secondary contact.
     * @return the value
     **/
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * If {@code true}, this Exadata Infrastructure contact is a valid My Oracle Support (MOS) contact. If {@code false}, this Exadata Infrastructure contact is not a valid MOS contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isContactMosValidated")
    private final Boolean isContactMosValidated;

    /**
     * If {@code true}, this Exadata Infrastructure contact is a valid My Oracle Support (MOS) contact. If {@code false}, this Exadata Infrastructure contact is not a valid MOS contact.
     * @return the value
     **/
    public Boolean getIsContactMosValidated() {
        return isContactMosValidated;
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
        sb.append("ExadataInfrastructureContact(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", isContactMosValidated=").append(String.valueOf(this.isContactMosValidated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInfrastructureContact)) {
            return false;
        }

        ExadataInfrastructureContact other = (ExadataInfrastructureContact) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.isContactMosValidated, other.isContactMosValidated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result =
                (result * PRIME)
                        + (this.isContactMosValidated == null
                                ? 43
                                : this.isContactMosValidated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
