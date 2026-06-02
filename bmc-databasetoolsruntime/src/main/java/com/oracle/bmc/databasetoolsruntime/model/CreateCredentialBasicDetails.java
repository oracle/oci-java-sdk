/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Details for the Credential for the Basic type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCredentialBasicDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCredentialBasicDetails extends CreateCredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The username for the new credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The username for the new credential.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The password for the new credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private char[] password;

        /**
         * The password for the new credential.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(char[] password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        public Builder password(String password) {
            this.password = password != null ? password.toCharArray() : null;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCredentialBasicDetails build() {
            CreateCredentialBasicDetails model =
                    new CreateCredentialBasicDetails(this.key, this.userName, this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCredentialBasicDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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

    @Deprecated
    public CreateCredentialBasicDetails(String key, String userName, String password) {
        super(key);
        this.userName = userName;
        this.password = password != null ? password.toCharArray() : null;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateCredentialBasicDetails(String key, String userName, char[] password) {
        super(key);
        this.userName = userName;
        this.password = password;
    }

    /**
     * The username for the new credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The username for the new credential.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The password for the new credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final char[] password;

    /**
     * The password for the new credential.
     * return the value
     * @Deprecated - Use getPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getPassword() {
        return password != null ? new String(password) : null;
    }

    /**
     * The password for the new credential.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    public char[] getPassword__AsCharArray() {
        return password;
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
        sb.append("CreateCredentialBasicDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", password=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCredentialBasicDetails)) {
            return false;
        }

        CreateCredentialBasicDetails other = (CreateCredentialBasicDetails) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.password, other.password)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        return result;
    }
}
