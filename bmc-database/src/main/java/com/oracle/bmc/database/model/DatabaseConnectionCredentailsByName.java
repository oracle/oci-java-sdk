/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Existing named credential used to connect to the database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseConnectionCredentailsByName.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseConnectionCredentailsByName extends DatabaseConnectionCredentials {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the credential information that used to connect to the database. The name
         * should be in "x.y" format, where the length of "x" has a maximum of 64 characters, and
         * length of "y" has a maximum of 199 characters. The name strings can contain letters,
         * numbers and the underscore character only. Other characters are not valid, except for the
         * "." character that separates the "x" and "y" portions of the name. *IMPORTANT* - The name
         * must be unique within the OCI region the credential is being created in. If you specify a
         * name that duplicates the name of another credential within the same OCI region, you may
         * overwrite or corrupt the credential that is already using the name.
         *
         * <p>For example: inventorydb.abc112233445566778899
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        /**
         * The name of the credential information that used to connect to the database. The name
         * should be in "x.y" format, where the length of "x" has a maximum of 64 characters, and
         * length of "y" has a maximum of 199 characters. The name strings can contain letters,
         * numbers and the underscore character only. Other characters are not valid, except for the
         * "." character that separates the "x" and "y" portions of the name. *IMPORTANT* - The name
         * must be unique within the OCI region the credential is being created in. If you specify a
         * name that duplicates the name of another credential within the same OCI region, you may
         * overwrite or corrupt the credential that is already using the name.
         *
         * <p>For example: inventorydb.abc112233445566778899
         *
         * @param credentialName the value to set
         * @return this builder
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionCredentailsByName build() {
            DatabaseConnectionCredentailsByName model =
                    new DatabaseConnectionCredentailsByName(this.credentialName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionCredentailsByName model) {
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
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

    @Deprecated
    public DatabaseConnectionCredentailsByName(String credentialName) {
        super();
        this.credentialName = credentialName;
    }

    /**
     * The name of the credential information that used to connect to the database. The name should
     * be in "x.y" format, where the length of "x" has a maximum of 64 characters, and length of "y"
     * has a maximum of 199 characters. The name strings can contain letters, numbers and the
     * underscore character only. Other characters are not valid, except for the "." character that
     * separates the "x" and "y" portions of the name. *IMPORTANT* - The name must be unique within
     * the OCI region the credential is being created in. If you specify a name that duplicates the
     * name of another credential within the same OCI region, you may overwrite or corrupt the
     * credential that is already using the name.
     *
     * <p>For example: inventorydb.abc112233445566778899
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The name of the credential information that used to connect to the database. The name should
     * be in "x.y" format, where the length of "x" has a maximum of 64 characters, and length of "y"
     * has a maximum of 199 characters. The name strings can contain letters, numbers and the
     * underscore character only. Other characters are not valid, except for the "." character that
     * separates the "x" and "y" portions of the name. *IMPORTANT* - The name must be unique within
     * the OCI region the credential is being created in. If you specify a name that duplicates the
     * name of another credential within the same OCI region, you may overwrite or corrupt the
     * credential that is already using the name.
     *
     * <p>For example: inventorydb.abc112233445566778899
     *
     * @return the value
     */
    public String getCredentialName() {
        return credentialName;
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
        sb.append("DatabaseConnectionCredentailsByName(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentialName=").append(String.valueOf(this.credentialName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionCredentailsByName)) {
            return false;
        }

        DatabaseConnectionCredentailsByName other = (DatabaseConnectionCredentailsByName) o;
        return java.util.Objects.equals(this.credentialName, other.credentialName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        return result;
    }
}
