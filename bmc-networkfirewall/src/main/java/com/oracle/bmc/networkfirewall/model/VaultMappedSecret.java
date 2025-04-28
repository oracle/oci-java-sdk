/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Mapped secret stored in OCI vault used in the firewall policy rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VaultMappedSecret.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VaultMappedSecret extends MappedSecret {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private InspectionType type;

        public Builder type(InspectionType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }
        /** OCID for the Vault Secret to be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * OCID for the Vault Secret to be used.
         *
         * @param vaultSecretId the value to set
         * @return this builder
         */
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }
        /** Version number of the secret to be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Integer versionNumber;

        /**
         * Version number of the secret to be used.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultMappedSecret build() {
            VaultMappedSecret model =
                    new VaultMappedSecret(
                            this.name,
                            this.type,
                            this.parentResourceId,
                            this.vaultSecretId,
                            this.versionNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultMappedSecret model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
            }
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
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
    public VaultMappedSecret(
            String name,
            InspectionType type,
            String parentResourceId,
            String vaultSecretId,
            Integer versionNumber) {
        super(name, type, parentResourceId);
        this.vaultSecretId = vaultSecretId;
        this.versionNumber = versionNumber;
    }

    /** OCID for the Vault Secret to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * OCID for the Vault Secret to be used.
     *
     * @return the value
     */
    public String getVaultSecretId() {
        return vaultSecretId;
    }

    /** Version number of the secret to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Integer versionNumber;

    /**
     * Version number of the secret to be used.
     *
     * @return the value
     */
    public Integer getVersionNumber() {
        return versionNumber;
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
        sb.append("VaultMappedSecret(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultMappedSecret)) {
            return false;
        }

        VaultMappedSecret other = (VaultMappedSecret) o;
        return java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        return result;
    }
}
