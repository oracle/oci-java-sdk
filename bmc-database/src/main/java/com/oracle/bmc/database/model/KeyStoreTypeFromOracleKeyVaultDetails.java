/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for Oracle Key Vault
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyStoreTypeFromOracleKeyVaultDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KeyStoreTypeFromOracleKeyVaultDetails extends KeyStoreTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("connectionIps")
        private java.util.List<String> connectionIps;

        public Builder connectionIps(java.util.List<String> connectionIps) {
            this.connectionIps = connectionIps;
            this.__explicitlySet__.add("connectionIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyStoreTypeFromOracleKeyVaultDetails build() {
            KeyStoreTypeFromOracleKeyVaultDetails __instance__ =
                    new KeyStoreTypeFromOracleKeyVaultDetails(
                            connectionIps, adminUsername, vaultId, secretId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyStoreTypeFromOracleKeyVaultDetails o) {
            Builder copiedBuilder =
                    connectionIps(o.getConnectionIps())
                            .adminUsername(o.getAdminUsername())
                            .vaultId(o.getVaultId())
                            .secretId(o.getSecretId());

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

    @Deprecated
    public KeyStoreTypeFromOracleKeyVaultDetails(
            java.util.List<String> connectionIps,
            String adminUsername,
            String vaultId,
            String secretId) {
        super();
        this.connectionIps = connectionIps;
        this.adminUsername = adminUsername;
        this.vaultId = vaultId;
        this.secretId = secretId;
    }

    /**
     * The list of Oracle Key Vault connection IP addresses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionIps")
    java.util.List<String> connectionIps;

    /**
     * The administrator username to connect to Oracle Key Vault
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    String adminUsername;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    String secretId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
