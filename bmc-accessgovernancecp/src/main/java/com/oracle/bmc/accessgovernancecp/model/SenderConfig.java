/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.accessgovernancecp.model;

/**
 * The sender information for email notifications sent by GovernanceInstance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SenderConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SenderConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "email",
        "isVerified",
        "timeVerifyResponseExpiry",
        "isInboxConfigured"
    })
    public SenderConfig(
            String displayName,
            String email,
            Boolean isVerified,
            java.util.Date timeVerifyResponseExpiry,
            Boolean isInboxConfigured) {
        super();
        this.displayName = displayName;
        this.email = email;
        this.isVerified = isVerified;
        this.timeVerifyResponseExpiry = timeVerifyResponseExpiry;
        this.isInboxConfigured = isInboxConfigured;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The sender's displayName. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The sender's displayName.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The sender's email. */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The sender's email.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** Whether or not the sender's email has been verified. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVerified")
        private Boolean isVerified;

        /**
         * Whether or not the sender's email has been verified.
         *
         * @param isVerified the value to set
         * @return this builder
         */
        public Builder isVerified(Boolean isVerified) {
            this.isVerified = isVerified;
            this.__explicitlySet__.add("isVerified");
            return this;
        }
        /** The time when the verify response needs to be received by. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeVerifyResponseExpiry")
        private java.util.Date timeVerifyResponseExpiry;

        /**
         * The time when the verify response needs to be received by.
         *
         * @param timeVerifyResponseExpiry the value to set
         * @return this builder
         */
        public Builder timeVerifyResponseExpiry(java.util.Date timeVerifyResponseExpiry) {
            this.timeVerifyResponseExpiry = timeVerifyResponseExpiry;
            this.__explicitlySet__.add("timeVerifyResponseExpiry");
            return this;
        }
        /** Whether the sender email has inbox configured to receive emails. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInboxConfigured")
        private Boolean isInboxConfigured;

        /**
         * Whether the sender email has inbox configured to receive emails.
         *
         * @param isInboxConfigured the value to set
         * @return this builder
         */
        public Builder isInboxConfigured(Boolean isInboxConfigured) {
            this.isInboxConfigured = isInboxConfigured;
            this.__explicitlySet__.add("isInboxConfigured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SenderConfig build() {
            SenderConfig model =
                    new SenderConfig(
                            this.displayName,
                            this.email,
                            this.isVerified,
                            this.timeVerifyResponseExpiry,
                            this.isInboxConfigured);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SenderConfig model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("isVerified")) {
                this.isVerified(model.getIsVerified());
            }
            if (model.wasPropertyExplicitlySet("timeVerifyResponseExpiry")) {
                this.timeVerifyResponseExpiry(model.getTimeVerifyResponseExpiry());
            }
            if (model.wasPropertyExplicitlySet("isInboxConfigured")) {
                this.isInboxConfigured(model.getIsInboxConfigured());
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

    /** The sender's displayName. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The sender's displayName.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The sender's email. */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The sender's email.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** Whether or not the sender's email has been verified. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVerified")
    private final Boolean isVerified;

    /**
     * Whether or not the sender's email has been verified.
     *
     * @return the value
     */
    public Boolean getIsVerified() {
        return isVerified;
    }

    /** The time when the verify response needs to be received by. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeVerifyResponseExpiry")
    private final java.util.Date timeVerifyResponseExpiry;

    /**
     * The time when the verify response needs to be received by.
     *
     * @return the value
     */
    public java.util.Date getTimeVerifyResponseExpiry() {
        return timeVerifyResponseExpiry;
    }

    /** Whether the sender email has inbox configured to receive emails. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInboxConfigured")
    private final Boolean isInboxConfigured;

    /**
     * Whether the sender email has inbox configured to receive emails.
     *
     * @return the value
     */
    public Boolean getIsInboxConfigured() {
        return isInboxConfigured;
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
        sb.append("SenderConfig(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", isVerified=").append(String.valueOf(this.isVerified));
        sb.append(", timeVerifyResponseExpiry=")
                .append(String.valueOf(this.timeVerifyResponseExpiry));
        sb.append(", isInboxConfigured=").append(String.valueOf(this.isInboxConfigured));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SenderConfig)) {
            return false;
        }

        SenderConfig other = (SenderConfig) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.isVerified, other.isVerified)
                && java.util.Objects.equals(
                        this.timeVerifyResponseExpiry, other.timeVerifyResponseExpiry)
                && java.util.Objects.equals(this.isInboxConfigured, other.isInboxConfigured)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.isVerified == null ? 43 : this.isVerified.hashCode());
        result =
                (result * PRIME)
                        + (this.timeVerifyResponseExpiry == null
                                ? 43
                                : this.timeVerifyResponseExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.isInboxConfigured == null ? 43 : this.isInboxConfigured.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
