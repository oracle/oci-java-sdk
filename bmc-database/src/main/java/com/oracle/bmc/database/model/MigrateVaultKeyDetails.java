/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for replacing existing Oracle-managed keys with customer-managed [Vault
 * service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) keys
 * and vice-versa is not supported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrateVaultKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MigrateVaultKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "tdeWalletPassword",
        "adminPassword"
    })
    public MigrateVaultKeyDetails(
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            String tdeWalletPassword,
            String adminPassword) {
        super();
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.tdeWalletPassword = tdeWalletPassword;
        this.adminPassword = adminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /** The existing TDE wallet password of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
        private String tdeWalletPassword;

        /**
         * The existing TDE wallet password of the database.
         *
         * @param tdeWalletPassword the value to set
         * @return this builder
         */
        public Builder tdeWalletPassword(String tdeWalletPassword) {
            this.tdeWalletPassword = tdeWalletPassword;
            this.__explicitlySet__.add("tdeWalletPassword");
            return this;
        }
        /** The existing admin password of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The existing admin password of the database.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrateVaultKeyDetails build() {
            MigrateVaultKeyDetails model =
                    new MigrateVaultKeyDetails(
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.vaultId,
                            this.tdeWalletPassword,
                            this.adminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrateVaultKeyDetails model) {
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("tdeWalletPassword")) {
                this.tdeWalletPassword(model.getTdeWalletPassword());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
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
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /** The existing TDE wallet password of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final String tdeWalletPassword;

    /**
     * The existing TDE wallet password of the database.
     *
     * @return the value
     */
    public String getTdeWalletPassword() {
        return tdeWalletPassword;
    }

    /** The existing admin password of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The existing admin password of the database.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
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
        sb.append("MigrateVaultKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", tdeWalletPassword=").append("<redacted>");
        sb.append(", adminPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrateVaultKeyDetails)) {
            return false;
        }

        MigrateVaultKeyDetails other = (MigrateVaultKeyDetails) o;
        return java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
