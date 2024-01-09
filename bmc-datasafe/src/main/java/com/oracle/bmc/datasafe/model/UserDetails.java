/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of a particular user. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "profile",
        "tablespace",
        "isUserPredefinedByOracle",
        "authenticationType"
    })
    public UserDetails(
            String name,
            String status,
            String profile,
            String tablespace,
            Boolean isUserPredefinedByOracle,
            AuthenticationType authenticationType) {
        super();
        this.name = name;
        this.status = status;
        this.profile = profile;
        this.tablespace = tablespace;
        this.isUserPredefinedByOracle = isUserPredefinedByOracle;
        this.authenticationType = authenticationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The status of the user account. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status of the user account.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The name of the profile assigned to the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

        /**
         * The name of the profile assigned to the user.
         *
         * @param profile the value to set
         * @return this builder
         */
        public Builder profile(String profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }
        /** The default tablespace of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
        private String tablespace;

        /**
         * The default tablespace of the user.
         *
         * @param tablespace the value to set
         * @return this builder
         */
        public Builder tablespace(String tablespace) {
            this.tablespace = tablespace;
            this.__explicitlySet__.add("tablespace");
            return this;
        }
        /** Indicates whether or not the user is predefined by ORACLE. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUserPredefinedByOracle")
        private Boolean isUserPredefinedByOracle;

        /**
         * Indicates whether or not the user is predefined by ORACLE.
         *
         * @param isUserPredefinedByOracle the value to set
         * @return this builder
         */
        public Builder isUserPredefinedByOracle(Boolean isUserPredefinedByOracle) {
            this.isUserPredefinedByOracle = isUserPredefinedByOracle;
            this.__explicitlySet__.add("isUserPredefinedByOracle");
            return this;
        }
        /** The authentication type of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * The authentication type of the user.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserDetails build() {
            UserDetails model =
                    new UserDetails(
                            this.name,
                            this.status,
                            this.profile,
                            this.tablespace,
                            this.isUserPredefinedByOracle,
                            this.authenticationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
            }
            if (model.wasPropertyExplicitlySet("tablespace")) {
                this.tablespace(model.getTablespace());
            }
            if (model.wasPropertyExplicitlySet("isUserPredefinedByOracle")) {
                this.isUserPredefinedByOracle(model.getIsUserPredefinedByOracle());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
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

    /** The status of the user account. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the user account.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The name of the profile assigned to the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final String profile;

    /**
     * The name of the profile assigned to the user.
     *
     * @return the value
     */
    public String getProfile() {
        return profile;
    }

    /** The default tablespace of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("tablespace")
    private final String tablespace;

    /**
     * The default tablespace of the user.
     *
     * @return the value
     */
    public String getTablespace() {
        return tablespace;
    }

    /** Indicates whether or not the user is predefined by ORACLE. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUserPredefinedByOracle")
    private final Boolean isUserPredefinedByOracle;

    /**
     * Indicates whether or not the user is predefined by ORACLE.
     *
     * @return the value
     */
    public Boolean getIsUserPredefinedByOracle() {
        return isUserPredefinedByOracle;
    }

    /** The authentication type of the user. */
    public enum AuthenticationType implements com.oracle.bmc.http.internal.BmcEnum {
        Password("PASSWORD"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AuthenticationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AuthenticationType: " + key);
        }
    };
    /** The authentication type of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * The authentication type of the user.
     *
     * @return the value
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
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
        sb.append("UserDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(", tablespace=").append(String.valueOf(this.tablespace));
        sb.append(", isUserPredefinedByOracle=")
                .append(String.valueOf(this.isUserPredefinedByOracle));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserDetails)) {
            return false;
        }

        UserDetails other = (UserDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.profile, other.profile)
                && java.util.Objects.equals(this.tablespace, other.tablespace)
                && java.util.Objects.equals(
                        this.isUserPredefinedByOracle, other.isUserPredefinedByOracle)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result = (result * PRIME) + (this.tablespace == null ? 43 : this.tablespace.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserPredefinedByOracle == null
                                ? 43
                                : this.isUserPredefinedByOracle.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
