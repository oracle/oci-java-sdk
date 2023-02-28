/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * User. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InvoicingUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InvoicingUser extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "userName",
        "firstName",
        "lastName",
        "email",
        "tcaContactId",
        "tcaCustAccntSiteId",
        "tcaPartyId"
    })
    public InvoicingUser(
            String name,
            String userName,
            String firstName,
            String lastName,
            String email,
            Long tcaContactId,
            Long tcaCustAccntSiteId,
            Long tcaPartyId) {
        super();
        this.name = name;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tcaContactId = tcaContactId;
        this.tcaCustAccntSiteId = tcaCustAccntSiteId;
        this.tcaPartyId = tcaPartyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** userName. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * userName.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** First name. */
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * First name.
         *
         * @param firstName the value to set
         * @return this builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /** Last name. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Last name.
         *
         * @param lastName the value to set
         * @return this builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /** Email. */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * Email.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** TCA contact ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tcaContactId")
        private Long tcaContactId;

        /**
         * TCA contact ID.
         *
         * @param tcaContactId the value to set
         * @return this builder
         */
        public Builder tcaContactId(Long tcaContactId) {
            this.tcaContactId = tcaContactId;
            this.__explicitlySet__.add("tcaContactId");
            return this;
        }
        /** TCA customer account site ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tcaCustAccntSiteId")
        private Long tcaCustAccntSiteId;

        /**
         * TCA customer account site ID.
         *
         * @param tcaCustAccntSiteId the value to set
         * @return this builder
         */
        public Builder tcaCustAccntSiteId(Long tcaCustAccntSiteId) {
            this.tcaCustAccntSiteId = tcaCustAccntSiteId;
            this.__explicitlySet__.add("tcaCustAccntSiteId");
            return this;
        }
        /** TCA party ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyId")
        private Long tcaPartyId;

        /**
         * TCA party ID.
         *
         * @param tcaPartyId the value to set
         * @return this builder
         */
        public Builder tcaPartyId(Long tcaPartyId) {
            this.tcaPartyId = tcaPartyId;
            this.__explicitlySet__.add("tcaPartyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicingUser build() {
            InvoicingUser model =
                    new InvoicingUser(
                            this.name,
                            this.userName,
                            this.firstName,
                            this.lastName,
                            this.email,
                            this.tcaContactId,
                            this.tcaCustAccntSiteId,
                            this.tcaPartyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicingUser model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("tcaContactId")) {
                this.tcaContactId(model.getTcaContactId());
            }
            if (model.wasPropertyExplicitlySet("tcaCustAccntSiteId")) {
                this.tcaCustAccntSiteId(model.getTcaCustAccntSiteId());
            }
            if (model.wasPropertyExplicitlySet("tcaPartyId")) {
                this.tcaPartyId(model.getTcaPartyId());
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

    /** Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** userName. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * userName.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** First name. */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * First name.
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /** Last name. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Last name.
     *
     * @return the value
     */
    public String getLastName() {
        return lastName;
    }

    /** Email. */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * Email.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** TCA contact ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tcaContactId")
    private final Long tcaContactId;

    /**
     * TCA contact ID.
     *
     * @return the value
     */
    public Long getTcaContactId() {
        return tcaContactId;
    }

    /** TCA customer account site ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tcaCustAccntSiteId")
    private final Long tcaCustAccntSiteId;

    /**
     * TCA customer account site ID.
     *
     * @return the value
     */
    public Long getTcaCustAccntSiteId() {
        return tcaCustAccntSiteId;
    }

    /** TCA party ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tcaPartyId")
    private final Long tcaPartyId;

    /**
     * TCA party ID.
     *
     * @return the value
     */
    public Long getTcaPartyId() {
        return tcaPartyId;
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
        sb.append("InvoicingUser(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", tcaContactId=").append(String.valueOf(this.tcaContactId));
        sb.append(", tcaCustAccntSiteId=").append(String.valueOf(this.tcaCustAccntSiteId));
        sb.append(", tcaPartyId=").append(String.valueOf(this.tcaPartyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicingUser)) {
            return false;
        }

        InvoicingUser other = (InvoicingUser) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.tcaContactId, other.tcaContactId)
                && java.util.Objects.equals(this.tcaCustAccntSiteId, other.tcaCustAccntSiteId)
                && java.util.Objects.equals(this.tcaPartyId, other.tcaPartyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.tcaContactId == null ? 43 : this.tcaContactId.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaCustAccntSiteId == null
                                ? 43
                                : this.tcaCustAccntSiteId.hashCode());
        result = (result * PRIME) + (this.tcaPartyId == null ? 43 : this.tcaPartyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
