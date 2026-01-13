/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The credentials for the HeatWave MySQL DB System replication user, containing the username and
 * the OCID of the vault secret that stores the password. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlDbSystemReplicationUserDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDbSystemReplicationUserDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"username", "passwordVaultSecretId"})
    public MySqlDbSystemReplicationUserDetails(String username, String passwordVaultSecretId) {
        super();
        this.username = username;
        this.passwordVaultSecretId = passwordVaultSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user name for connecting to the HeatWave MySQL DB System node.
         *
         * <p>Example: {@code user}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The user name for connecting to the HeatWave MySQL DB System node.
         *
         * <p>Example: {@code user}
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The OCID of the vault secret where the HeatWave MySQL DB System password is stored.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
        private String passwordVaultSecretId;

        /**
         * The OCID of the vault secret where the HeatWave MySQL DB System password is stored.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
         *
         * @param passwordVaultSecretId the value to set
         * @return this builder
         */
        public Builder passwordVaultSecretId(String passwordVaultSecretId) {
            this.passwordVaultSecretId = passwordVaultSecretId;
            this.__explicitlySet__.add("passwordVaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDbSystemReplicationUserDetails build() {
            MySqlDbSystemReplicationUserDetails model =
                    new MySqlDbSystemReplicationUserDetails(
                            this.username, this.passwordVaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDbSystemReplicationUserDetails model) {
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("passwordVaultSecretId")) {
                this.passwordVaultSecretId(model.getPasswordVaultSecretId());
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
     * The user name for connecting to the HeatWave MySQL DB System node.
     *
     * <p>Example: {@code user}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The user name for connecting to the HeatWave MySQL DB System node.
     *
     * <p>Example: {@code user}
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The OCID of the vault secret where the HeatWave MySQL DB System password is stored.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVaultSecretId")
    private final String passwordVaultSecretId;

    /**
     * The OCID of the vault secret where the HeatWave MySQL DB System password is stored.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPasswordVaultSecretId() {
        return passwordVaultSecretId;
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
        sb.append("MySqlDbSystemReplicationUserDetails(");
        sb.append("super=").append(super.toString());
        sb.append("username=").append(String.valueOf(this.username));
        sb.append(", passwordVaultSecretId=").append(String.valueOf(this.passwordVaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDbSystemReplicationUserDetails)) {
            return false;
        }

        MySqlDbSystemReplicationUserDetails other = (MySqlDbSystemReplicationUserDetails) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.passwordVaultSecretId, other.passwordVaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVaultSecretId == null
                                ? 43
                                : this.passwordVaultSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
