/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * User summary that can redeem rewards. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RedeemableUserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RedeemableUserSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"emailId", "firstName", "lastName"})
    public RedeemableUserSummary(String emailId, String firstName, String lastName) {
        super();
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The email ID of the user that can redeem rewards. */
        @com.fasterxml.jackson.annotation.JsonProperty("emailId")
        private String emailId;

        /**
         * The email ID of the user that can redeem rewards.
         *
         * @param emailId the value to set
         * @return this builder
         */
        public Builder emailId(String emailId) {
            this.emailId = emailId;
            this.__explicitlySet__.add("emailId");
            return this;
        }
        /** The first name of the user that can redeem rewards. */
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * The first name of the user that can redeem rewards.
         *
         * @param firstName the value to set
         * @return this builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /** The last name of the user that can redeem rewards. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * The last name of the user that can redeem rewards.
         *
         * @param lastName the value to set
         * @return this builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedeemableUserSummary build() {
            RedeemableUserSummary model =
                    new RedeemableUserSummary(this.emailId, this.firstName, this.lastName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedeemableUserSummary model) {
            if (model.wasPropertyExplicitlySet("emailId")) {
                this.emailId(model.getEmailId());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
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

    /** The email ID of the user that can redeem rewards. */
    @com.fasterxml.jackson.annotation.JsonProperty("emailId")
    private final String emailId;

    /**
     * The email ID of the user that can redeem rewards.
     *
     * @return the value
     */
    public String getEmailId() {
        return emailId;
    }

    /** The first name of the user that can redeem rewards. */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * The first name of the user that can redeem rewards.
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /** The last name of the user that can redeem rewards. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * The last name of the user that can redeem rewards.
     *
     * @return the value
     */
    public String getLastName() {
        return lastName;
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
        sb.append("RedeemableUserSummary(");
        sb.append("super=").append(super.toString());
        sb.append("emailId=").append(String.valueOf(this.emailId));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedeemableUserSummary)) {
            return false;
        }

        RedeemableUserSummary other = (RedeemableUserSummary) o;
        return java.util.Objects.equals(this.emailId, other.emailId)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.emailId == null ? 43 : this.emailId.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
