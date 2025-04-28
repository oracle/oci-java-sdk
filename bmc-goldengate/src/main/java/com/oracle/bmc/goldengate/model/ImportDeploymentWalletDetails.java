/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Metadata required to import wallet to deployment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportDeploymentWalletDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportDeploymentWalletDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vaultId",
        "newWalletSecretId",
        "walletBackupSecretName",
        "walletBackupSecretCompartmentId",
        "masterEncryptionKeyId",
        "description"
    })
    public ImportDeploymentWalletDetails(
            String vaultId,
            String newWalletSecretId,
            String walletBackupSecretName,
            String walletBackupSecretCompartmentId,
            String masterEncryptionKeyId,
            String description) {
        super();
        this.vaultId = vaultId;
        this.newWalletSecretId = newWalletSecretId;
        this.walletBackupSecretName = walletBackupSecretName;
        this.walletBackupSecretCompartmentId = walletBackupSecretCompartmentId;
        this.masterEncryptionKeyId = masterEncryptionKeyId;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate
         * can manage secrets. Customers must add policies to permit GoldenGate to manage secrets
         * contained within this vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate
         * can manage secrets. Customers must add policies to permit GoldenGate to manage secrets
         * contained within this vault.
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
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("newWalletSecretId")
        private String newWalletSecretId;

        /**
         * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key
         * that customers will be required to ensure the policies are established to permit
         * GoldenGate to use this Secret.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment, where the secret will be created in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("walletBackupSecretCompartmentId")
        private String walletBackupSecretCompartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment, where the secret will be created in.
         *
         * @param walletBackupSecretCompartmentId the value to set
         * @return this builder
         */
        public Builder walletBackupSecretCompartmentId(String walletBackupSecretCompartmentId) {
            this.walletBackupSecretCompartmentId = walletBackupSecretCompartmentId;
            this.__explicitlySet__.add("walletBackupSecretCompartmentId");
            return this;
        }
        /**
         * Refers to the customer's master key OCID. If provided, it references a key to manage
         * secrets. Customers must add policies to permit GoldenGate to use this key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
        private String masterEncryptionKeyId;

        /**
         * Refers to the customer's master key OCID. If provided, it references a key to manage
         * secrets. Customers must add policies to permit GoldenGate to use this key.
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
                            this.walletBackupSecretCompartmentId,
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
            if (model.wasPropertyExplicitlySet("walletBackupSecretCompartmentId")) {
                this.walletBackupSecretCompartmentId(model.getWalletBackupSecretCompartmentId());
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
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("newWalletSecretId")
    private final String newWalletSecretId;

    /**
     * The OCID of the customer's GoldenGate Service Secret. If provided, it references a key that
     * customers will be required to ensure the policies are established to permit GoldenGate to use
     * this Secret.
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment, where the secret will be created in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("walletBackupSecretCompartmentId")
    private final String walletBackupSecretCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment, where the secret will be created in.
     *
     * @return the value
     */
    public String getWalletBackupSecretCompartmentId() {
        return walletBackupSecretCompartmentId;
    }

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
    private final String masterEncryptionKeyId;

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
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
        sb.append(", walletBackupSecretCompartmentId=")
                .append(String.valueOf(this.walletBackupSecretCompartmentId));
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
                && java.util.Objects.equals(
                        this.walletBackupSecretCompartmentId, other.walletBackupSecretCompartmentId)
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
                        + (this.walletBackupSecretCompartmentId == null
                                ? 43
                                : this.walletBackupSecretCompartmentId.hashCode());
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
