/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Configuration details for the Autonomous Database [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts) key.
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
    builder = ConfigureAutonomousDatabaseVaultKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigureAutonomousDatabaseVaultKeyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"kmsKeyId", "vaultId", "isUsingOracleManagedKeys"})
    public ConfigureAutonomousDatabaseVaultKeyDetails(
            String kmsKeyId, String vaultId, Boolean isUsingOracleManagedKeys) {
        super();
        this.kmsKeyId = kmsKeyId;
        this.vaultId = vaultId;
        this.isUsingOracleManagedKeys = isUsingOracleManagedKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * True if disable Customer Managed Keys and use Oracle Managed Keys.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUsingOracleManagedKeys")
        private Boolean isUsingOracleManagedKeys;

        /**
         * True if disable Customer Managed Keys and use Oracle Managed Keys.
         * @param isUsingOracleManagedKeys the value to set
         * @return this builder
         **/
        public Builder isUsingOracleManagedKeys(Boolean isUsingOracleManagedKeys) {
            this.isUsingOracleManagedKeys = isUsingOracleManagedKeys;
            this.__explicitlySet__.add("isUsingOracleManagedKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigureAutonomousDatabaseVaultKeyDetails build() {
            ConfigureAutonomousDatabaseVaultKeyDetails __instance__ =
                    new ConfigureAutonomousDatabaseVaultKeyDetails(
                            kmsKeyId, vaultId, isUsingOracleManagedKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigureAutonomousDatabaseVaultKeyDetails o) {
            Builder copiedBuilder =
                    kmsKeyId(o.getKmsKeyId())
                            .vaultId(o.getVaultId())
                            .isUsingOracleManagedKeys(o.getIsUsingOracleManagedKeys());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * True if disable Customer Managed Keys and use Oracle Managed Keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUsingOracleManagedKeys")
    private final Boolean isUsingOracleManagedKeys;

    /**
     * True if disable Customer Managed Keys and use Oracle Managed Keys.
     * @return the value
     **/
    public Boolean getIsUsingOracleManagedKeys() {
        return isUsingOracleManagedKeys;
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
        sb.append("ConfigureAutonomousDatabaseVaultKeyDetails(");
        sb.append("kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", isUsingOracleManagedKeys=")
                .append(String.valueOf(this.isUsingOracleManagedKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigureAutonomousDatabaseVaultKeyDetails)) {
            return false;
        }

        ConfigureAutonomousDatabaseVaultKeyDetails other =
                (ConfigureAutonomousDatabaseVaultKeyDetails) o;
        return java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.isUsingOracleManagedKeys, other.isUsingOracleManagedKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsingOracleManagedKeys == null
                                ? 43
                                : this.isUsingOracleManagedKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
