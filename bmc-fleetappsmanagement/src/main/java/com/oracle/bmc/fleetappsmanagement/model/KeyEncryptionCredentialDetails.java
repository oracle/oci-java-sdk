/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for the Credentials that use key encryption. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KeyEncryptionCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyEncryptionCredentialDetails extends CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The value corresponding to the credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value corresponding to the credential.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** OCID for the Vault Key that will be used to encrypt/decrypt the value given. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * OCID for the Vault Key that will be used to encrypt/decrypt the value given.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** The Vault Key version. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersion")
        private String keyVersion;

        /**
         * The Vault Key version.
         *
         * @param keyVersion the value to set
         * @return this builder
         */
        public Builder keyVersion(String keyVersion) {
            this.keyVersion = keyVersion;
            this.__explicitlySet__.add("keyVersion");
            return this;
        }
        /**
         * OCID for the Vault that will be used to fetch the key to encrypt/decrypt the value given.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * OCID for the Vault that will be used to fetch the key to encrypt/decrypt the value given.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyEncryptionCredentialDetails build() {
            KeyEncryptionCredentialDetails model =
                    new KeyEncryptionCredentialDetails(
                            this.value, this.keyId, this.keyVersion, this.vaultId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyEncryptionCredentialDetails model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyVersion")) {
                this.keyVersion(model.getKeyVersion());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
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
    public KeyEncryptionCredentialDetails(
            String value, String keyId, String keyVersion, String vaultId) {
        super();
        this.value = value;
        this.keyId = keyId;
        this.keyVersion = keyVersion;
        this.vaultId = vaultId;
    }

    /** The value corresponding to the credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value corresponding to the credential.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** OCID for the Vault Key that will be used to encrypt/decrypt the value given. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * OCID for the Vault Key that will be used to encrypt/decrypt the value given.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** The Vault Key version. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersion")
    private final String keyVersion;

    /**
     * The Vault Key version.
     *
     * @return the value
     */
    public String getKeyVersion() {
        return keyVersion;
    }

    /** OCID for the Vault that will be used to fetch the key to encrypt/decrypt the value given. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * OCID for the Vault that will be used to fetch the key to encrypt/decrypt the value given.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
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
        sb.append("KeyEncryptionCredentialDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyVersion=").append(String.valueOf(this.keyVersion));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyEncryptionCredentialDetails)) {
            return false;
        }

        KeyEncryptionCredentialDetails other = (KeyEncryptionCredentialDetails) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyVersion, other.keyVersion)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyVersion == null ? 43 : this.keyVersion.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        return result;
    }
}
