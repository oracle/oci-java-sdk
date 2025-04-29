/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a customer-managed vault and encryption key in the destination region. The
 * customer-managed encryption key in this will be used to encrypt the resource or containing
 * resources after they move to the destination region. <br>
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
        builder = UpdateVaultAndEncryptionKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateVaultAndEncryptionKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vaultId", "encryptionKeyId"})
    public UpdateVaultAndEncryptionKeyDetails(String vaultId, String encryptionKeyId) {
        super();
        this.vaultId = vaultId;
        this.encryptionKeyId = encryptionKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the destination region vault for the customer-managed encryption key.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the destination region vault for the customer-managed encryption key.
         *
         * <p>Example: {@code ocid1.vault.oc1..uniqueID}
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
         * The OCID of the customer-managed encryption key in the destination region vault.
         *
         * <p>Example: {@code ocid1.key.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyId")
        private String encryptionKeyId;

        /**
         * The OCID of the customer-managed encryption key in the destination region vault.
         *
         * <p>Example: {@code ocid1.key.oc1..uniqueID}
         *
         * @param encryptionKeyId the value to set
         * @return this builder
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            this.__explicitlySet__.add("encryptionKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVaultAndEncryptionKeyDetails build() {
            UpdateVaultAndEncryptionKeyDetails model =
                    new UpdateVaultAndEncryptionKeyDetails(this.vaultId, this.encryptionKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVaultAndEncryptionKeyDetails model) {
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyId")) {
                this.encryptionKeyId(model.getEncryptionKeyId());
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
     * The OCID of the destination region vault for the customer-managed encryption key.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the destination region vault for the customer-managed encryption key.
     *
     * <p>Example: {@code ocid1.vault.oc1..uniqueID}
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the customer-managed encryption key in the destination region vault.
     *
     * <p>Example: {@code ocid1.key.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyId")
    private final String encryptionKeyId;

    /**
     * The OCID of the customer-managed encryption key in the destination region vault.
     *
     * <p>Example: {@code ocid1.key.oc1..uniqueID}
     *
     * @return the value
     */
    public String getEncryptionKeyId() {
        return encryptionKeyId;
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
        sb.append("UpdateVaultAndEncryptionKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", encryptionKeyId=").append(String.valueOf(this.encryptionKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVaultAndEncryptionKeyDetails)) {
            return false;
        }

        UpdateVaultAndEncryptionKeyDetails other = (UpdateVaultAndEncryptionKeyDetails) o;
        return java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.encryptionKeyId, other.encryptionKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKeyId == null ? 43 : this.encryptionKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
