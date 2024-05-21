/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Vault verification source details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VaultSecretVerificationKeySource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "verificationKeySourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VaultSecretVerificationKeySource extends VerificationKeySource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Vault Secret containing the verification key versions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * The OCID of the Vault Secret containing the verification key versions.
         * @param vaultSecretId the value to set
         * @return this builder
         **/
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultSecretVerificationKeySource build() {
            VaultSecretVerificationKeySource model =
                    new VaultSecretVerificationKeySource(this.vaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultSecretVerificationKeySource model) {
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
            }
            return this;
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

    @Deprecated
    public VaultSecretVerificationKeySource(String vaultSecretId) {
        super();
        this.vaultSecretId = vaultSecretId;
    }

    /**
     * The OCID of the Vault Secret containing the verification key versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * The OCID of the Vault Secret containing the verification key versions.
     * @return the value
     **/
    public String getVaultSecretId() {
        return vaultSecretId;
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
        sb.append("VaultSecretVerificationKeySource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultSecretVerificationKeySource)) {
            return false;
        }

        VaultSecretVerificationKeySource other = (VaultSecretVerificationKeySource) o;
        return java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        return result;
    }
}
