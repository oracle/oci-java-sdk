/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class User extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "isOTP", "isMfaActivated", "isMfaVerified"})
    public User(
            String id, String name, Boolean isOTP, Boolean isMfaActivated, Boolean isMfaVerified) {
        super();
        this.id = id;
        this.name = name;
        this.isOTP = isOTP;
        this.isMfaActivated = isMfaActivated;
        this.isMfaVerified = isMfaVerified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user's Oracle ID (OCID). */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The user's Oracle ID (OCID).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the user.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** If the provided password is a one-time password. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
        private Boolean isOTP;

        /**
         * If the provided password is a one-time password.
         *
         * @param isOTP the value to set
         * @return this builder
         */
        public Builder isOTP(Boolean isOTP) {
            this.isOTP = isOTP;
            this.__explicitlySet__.add("isOTP");
            return this;
        }
        /** If mfa is activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
        private Boolean isMfaActivated;

        /**
         * If mfa is activated.
         *
         * @param isMfaActivated the value to set
         * @return this builder
         */
        public Builder isMfaActivated(Boolean isMfaActivated) {
            this.isMfaActivated = isMfaActivated;
            this.__explicitlySet__.add("isMfaActivated");
            return this;
        }
        /** If the user has been mfa verified. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
        private Boolean isMfaVerified;

        /**
         * If the user has been mfa verified.
         *
         * @param isMfaVerified the value to set
         * @return this builder
         */
        public Builder isMfaVerified(Boolean isMfaVerified) {
            this.isMfaVerified = isMfaVerified;
            this.__explicitlySet__.add("isMfaVerified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User model =
                    new User(
                            this.id,
                            this.name,
                            this.isOTP,
                            this.isMfaActivated,
                            this.isMfaVerified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isOTP")) {
                this.isOTP(model.getIsOTP());
            }
            if (model.wasPropertyExplicitlySet("isMfaActivated")) {
                this.isMfaActivated(model.getIsMfaActivated());
            }
            if (model.wasPropertyExplicitlySet("isMfaVerified")) {
                this.isMfaVerified(model.getIsMfaVerified());
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

    /** The user's Oracle ID (OCID). */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The user's Oracle ID (OCID).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the user.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** If the provided password is a one-time password. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
    private final Boolean isOTP;

    /**
     * If the provided password is a one-time password.
     *
     * @return the value
     */
    public Boolean getIsOTP() {
        return isOTP;
    }

    /** If mfa is activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
    private final Boolean isMfaActivated;

    /**
     * If mfa is activated.
     *
     * @return the value
     */
    public Boolean getIsMfaActivated() {
        return isMfaActivated;
    }

    /** If the user has been mfa verified. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
    private final Boolean isMfaVerified;

    /**
     * If the user has been mfa verified.
     *
     * @return the value
     */
    public Boolean getIsMfaVerified() {
        return isMfaVerified;
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
        sb.append("User(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isOTP=").append(String.valueOf(this.isOTP));
        sb.append(", isMfaActivated=").append(String.valueOf(this.isMfaActivated));
        sb.append(", isMfaVerified=").append(String.valueOf(this.isMfaVerified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isOTP, other.isOTP)
                && java.util.Objects.equals(this.isMfaActivated, other.isMfaActivated)
                && java.util.Objects.equals(this.isMfaVerified, other.isMfaVerified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isOTP == null ? 43 : this.isOTP.hashCode());
        result =
                (result * PRIME)
                        + (this.isMfaActivated == null ? 43 : this.isMfaActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.isMfaVerified == null ? 43 : this.isMfaVerified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
