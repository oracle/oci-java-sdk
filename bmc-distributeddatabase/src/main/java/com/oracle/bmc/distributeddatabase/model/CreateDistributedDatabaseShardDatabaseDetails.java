/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details for creating a distributed database shard. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source",
        defaultImpl = CreateDistributedDatabaseShardDatabaseDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardWithExadbXsNewClusterDetails.class,
            name = "XS_NEW_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardWithExadbXsNewVaultAndClusterDetails.class,
            name = "XS_NEW_VAULT_AND_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithExadbXsDetails.class,
            name = "XS_EXISTING_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithDbHomeDetails.class,
            name = "EXISTING_DB_HOME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithExadbXdDetails.class,
            name = "XD_EXISTING_CLUSTER")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateDistributedDatabaseShardDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    protected CreateDistributedDatabaseShardDatabaseDetails(
            String tdeWalletPassword,
            String tdeWalletPasswordSecretId,
            Integer tdeWalletPasswordSecretVersionNumber) {
        super();
        this.tdeWalletPassword = tdeWalletPassword != null ? tdeWalletPassword.toCharArray() : null;
        this.tdeWalletPasswordSecretId = tdeWalletPasswordSecretId;
        this.tdeWalletPasswordSecretVersionNumber = tdeWalletPasswordSecretVersionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "tdeWalletPassword",
        "tdeWalletPasswordSecretId",
        "tdeWalletPasswordSecretVersionNumber"
    })
    protected CreateDistributedDatabaseShardDatabaseDetails(
            char[] tdeWalletPassword,
            String tdeWalletPasswordSecretId,
            Integer tdeWalletPasswordSecretVersionNumber) {
        super();
        this.tdeWalletPassword = tdeWalletPassword;
        this.tdeWalletPasswordSecretId = tdeWalletPasswordSecretId;
        this.tdeWalletPasswordSecretVersionNumber = tdeWalletPasswordSecretVersionNumber;
    }

    /**
     * The password to open the TDE wallet. The password must be 9 to 255 characters and contain at
     * least two uppercase letters, two lowercase letters, two numeric characters, and two special
     * characters. The allowed special characters are _, \\#, and -.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final char[] tdeWalletPassword;

    /**
     * The password to open the TDE wallet. The password must be 9 to 255 characters and contain at
     * least two uppercase letters, two lowercase letters, two numeric characters, and two special
     * characters. The allowed special characters are _, \\#, and -.
     *
     * @return the value
     * @deprecated Use getTdeWalletPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getTdeWalletPassword() {
        return tdeWalletPassword != null ? new String(tdeWalletPassword) : null;
    }

    /**
     * The password to open the TDE wallet. The password must be 9 to 255 characters and contain at
     * least two uppercase letters, two lowercase letters, two numeric characters, and two special
     * characters. The allowed special characters are _, \\#, and -.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    public char[] getTdeWalletPassword__AsCharArray() {
        return tdeWalletPassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * vault secret. This cannot be used in conjunction with tdeWalletPassword.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPasswordSecretId")
    private final String tdeWalletPasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * vault secret. This cannot be used in conjunction with tdeWalletPassword.
     *
     * @return the value
     */
    public String getTdeWalletPasswordSecretId() {
        return tdeWalletPasswordSecretId;
    }

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPasswordSecretVersionNumber")
    private final Integer tdeWalletPasswordSecretVersionNumber;

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     *
     * @return the value
     */
    public Integer getTdeWalletPasswordSecretVersionNumber() {
        return tdeWalletPasswordSecretVersionNumber;
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
        sb.append("CreateDistributedDatabaseShardDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tdeWalletPassword=").append("<redacted>");
        sb.append(", tdeWalletPasswordSecretId=")
                .append(String.valueOf(this.tdeWalletPasswordSecretId));
        sb.append(", tdeWalletPasswordSecretVersionNumber=")
                .append(String.valueOf(this.tdeWalletPasswordSecretVersionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDistributedDatabaseShardDatabaseDetails)) {
            return false;
        }

        CreateDistributedDatabaseShardDatabaseDetails other =
                (CreateDistributedDatabaseShardDatabaseDetails) o;
        return java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && java.util.Objects.equals(
                        this.tdeWalletPasswordSecretId, other.tdeWalletPasswordSecretId)
                && java.util.Objects.equals(
                        this.tdeWalletPasswordSecretVersionNumber,
                        other.tdeWalletPasswordSecretVersionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPasswordSecretId == null
                                ? 43
                                : this.tdeWalletPasswordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPasswordSecretVersionNumber == null
                                ? 43
                                : this.tdeWalletPasswordSecretVersionNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the Globally distributed database type. Use XS_EXISTING_CLUSTER for a database
     * on Exascale Infrastructure that uses a pre-existing cluster. Use XS_NEW_CLUSTER for a
     * database on Exascale Infrastructure that requires a new cluster created from scratch. Use
     * XS_NEW_VAULT_AND_CLUSTER for a database on Exascale Infrastructure that requires a new vault
     * and cluster created from scratch. Use XD_EXISTING_CLUSTER for a database on Dedicated
     * Infrastructure that uses a pre-existing cluster. Use EXISTING_DB_HOME for a database on a
     * pre-existing database home.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        XsExistingCluster("XS_EXISTING_CLUSTER"),
        XsNewCluster("XS_NEW_CLUSTER"),
        XsNewVaultAndCluster("XS_NEW_VAULT_AND_CLUSTER"),
        XdExistingCluster("XD_EXISTING_CLUSTER"),
        ExistingDbHome("EXISTING_DB_HOME"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
