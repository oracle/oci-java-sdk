/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Metadata required to import wallet to deployment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportDeploymentWalletDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImportDeploymentWalletDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vaultId",
        "newWalletSecretId",
        "walletBackupSecretName",
        "masterEncryptionKeyId",
        "description"
    })
    public ImportDeploymentWalletDetails(
            String vaultId,
            String newWalletSecretId,
            String walletBackupSecretName,
            String masterEncryptionKeyId,
            String description) {
        super();
        this.vaultId = vaultId;
        this.newWalletSecretId = newWalletSecretId;
        this.walletBackupSecretName = walletBackupSecretName;
        this.masterEncryptionKeyId = masterEncryptionKeyId;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer vault being referenced. If provided, this will reference a vault which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to manage secrets contained within this vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer vault being referenced. If provided, this will reference a vault which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to manage secrets contained within this vault.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer GGS Secret being referenced. If provided, this will reference a key which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to utilize this Secret
         */
        @com.fasterxml.jackson.annotation.JsonProperty("newWalletSecretId")
        private String newWalletSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer GGS Secret being referenced. If provided, this will reference a key which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to utilize this Secret
         *
         * @param newWalletSecretId the value to set
         * @return this builder
         */
        public Builder newWalletSecretId(String newWalletSecretId) {
            this.newWalletSecretId = newWalletSecretId;
            this.__explicitlySet__.add("newWalletSecretId");
            return this;
        }
        /** Name of the secret with which secret is shown in vault */
        @com.fasterxml.jackson.annotation.JsonProperty("walletBackupSecretName")
        private String walletBackupSecretName;

        /**
         * Name of the secret with which secret is shown in vault
         *
         * @param walletBackupSecretName the value to set
         * @return this builder
         */
        public Builder walletBackupSecretName(String walletBackupSecretName) {
            this.walletBackupSecretName = walletBackupSecretName;
            this.__explicitlySet__.add("walletBackupSecretName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer "Master" key being referenced. If provided, this will reference a key which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to utilize this key to manage secrets.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
        private String masterEncryptionKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer "Master" key being referenced. If provided, this will reference a key which the
         * customer will be required to ensure the policies are established to permit the GoldenGate
         * Service to utilize this key to manage secrets.
         *
         * @param masterEncryptionKeyId the value to set
         * @return this builder
         */
        public Builder masterEncryptionKeyId(String masterEncryptionKeyId) {
            this.masterEncryptionKeyId = masterEncryptionKeyId;
            this.__explicitlySet__.add("masterEncryptionKeyId");
            return this;
        }
        /** Metadata about this specific object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportDeploymentWalletDetails build() {
            ImportDeploymentWalletDetails model =
                    new ImportDeploymentWalletDetails(
                            this.vaultId,
                            this.newWalletSecretId,
                            this.walletBackupSecretName,
                            this.masterEncryptionKeyId,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportDeploymentWalletDetails model) {
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("newWalletSecretId")) {
                this.newWalletSecretId(model.getNewWalletSecretId());
            }
            if (model.wasPropertyExplicitlySet("walletBackupSecretName")) {
                this.walletBackupSecretName(model.getWalletBackupSecretName());
            }
            if (model.wasPropertyExplicitlySet("masterEncryptionKeyId")) {
                this.masterEncryptionKeyId(model.getMasterEncryptionKeyId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer vault being referenced. If provided, this will reference a vault which the customer
     * will be required to ensure the policies are established to permit the GoldenGate Service to
     * manage secrets contained within this vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer vault being referenced. If provided, this will reference a vault which the customer
     * will be required to ensure the policies are established to permit the GoldenGate Service to
     * manage secrets contained within this vault.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer GGS Secret being referenced. If provided, this will reference a key which the
     * customer will be required to ensure the policies are established to permit the GoldenGate
     * Service to utilize this Secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("newWalletSecretId")
    private final String newWalletSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer GGS Secret being referenced. If provided, this will reference a key which the
     * customer will be required to ensure the policies are established to permit the GoldenGate
     * Service to utilize this Secret
     *
     * @return the value
     */
    public String getNewWalletSecretId() {
        return newWalletSecretId;
    }

    /** Name of the secret with which secret is shown in vault */
    @com.fasterxml.jackson.annotation.JsonProperty("walletBackupSecretName")
    private final String walletBackupSecretName;

    /**
     * Name of the secret with which secret is shown in vault
     *
     * @return the value
     */
    public String getWalletBackupSecretName() {
        return walletBackupSecretName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer "Master" key being referenced. If provided, this will reference a key which the
     * customer will be required to ensure the policies are established to permit the GoldenGate
     * Service to utilize this key to manage secrets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
    private final String masterEncryptionKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer "Master" key being referenced. If provided, this will reference a key which the
     * customer will be required to ensure the policies are established to permit the GoldenGate
     * Service to utilize this key to manage secrets.
     *
     * @return the value
     */
    public String getMasterEncryptionKeyId() {
        return masterEncryptionKeyId;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("ImportDeploymentWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", newWalletSecretId=").append(String.valueOf(this.newWalletSecretId));
        sb.append(", walletBackupSecretName=").append(String.valueOf(this.walletBackupSecretName));
        sb.append(", masterEncryptionKeyId=").append(String.valueOf(this.masterEncryptionKeyId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportDeploymentWalletDetails)) {
            return false;
        }

        ImportDeploymentWalletDetails other = (ImportDeploymentWalletDetails) o;
        return java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.newWalletSecretId, other.newWalletSecretId)
                && java.util.Objects.equals(
                        this.walletBackupSecretName, other.walletBackupSecretName)
                && java.util.Objects.equals(this.masterEncryptionKeyId, other.masterEncryptionKeyId)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.newWalletSecretId == null ? 43 : this.newWalletSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletBackupSecretName == null
                                ? 43
                                : this.walletBackupSecretName.hashCode());
        result =
                (result * PRIME)
                        + (this.masterEncryptionKeyId == null
                                ? 43
                                : this.masterEncryptionKeyId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
