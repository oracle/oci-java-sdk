/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Oracle Identity Cloud Service self service schema extension <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExtensionMeUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionMeUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currentPassword"})
    public ExtensionMeUser(String currentPassword) {
        super();
        this.currentPassword = currentPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The current password is required if the user attempts to change the values of attributes
         * that are used in recovering or verifying the user's own identity. If the current password
         * is specified, it will be used to authenticate the user regardless of any change in these
         * attribute values
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash - multiValued:
         * false - mutability: writeOnly - required: false - returned: never - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentPassword")
        private String currentPassword;

        /**
         * The current password is required if the user attempts to change the values of attributes
         * that are used in recovering or verifying the user's own identity. If the current password
         * is specified, it will be used to authenticate the user regardless of any change in these
         * attribute values
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash - multiValued:
         * false - mutability: writeOnly - required: false - returned: never - type: string -
         * uniqueness: none
         *
         * @param currentPassword the value to set
         * @return this builder
         */
        public Builder currentPassword(String currentPassword) {
            this.currentPassword = currentPassword;
            this.__explicitlySet__.add("currentPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionMeUser build() {
            ExtensionMeUser model = new ExtensionMeUser(this.currentPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionMeUser model) {
            if (model.wasPropertyExplicitlySet("currentPassword")) {
                this.currentPassword(model.getCurrentPassword());
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

    /**
     * The current password is required if the user attempts to change the values of attributes that
     * are used in recovering or verifying the user's own identity. If the current password is
     * specified, it will be used to authenticate the user regardless of any change in these
     * attribute values
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash - multiValued: false -
     * mutability: writeOnly - required: false - returned: never - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentPassword")
    private final String currentPassword;

    /**
     * The current password is required if the user attempts to change the values of attributes that
     * are used in recovering or verifying the user's own identity. If the current password is
     * specified, it will be used to authenticate the user regardless of any change in these
     * attribute values
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash - multiValued: false -
     * mutability: writeOnly - required: false - returned: never - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCurrentPassword() {
        return currentPassword;
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
        sb.append("ExtensionMeUser(");
        sb.append("super=").append(super.toString());
        sb.append("currentPassword=").append(String.valueOf(this.currentPassword));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionMeUser)) {
            return false;
        }

        ExtensionMeUser other = (ExtensionMeUser) o;
        return java.util.Objects.equals(this.currentPassword, other.currentPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentPassword == null ? 43 : this.currentPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
