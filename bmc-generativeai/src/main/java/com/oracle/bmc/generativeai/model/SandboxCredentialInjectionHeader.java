/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The HTTP request header and OCI Vault secret used by a credential injection rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxCredentialInjectionHeader.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxCredentialInjectionHeader
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "prefix", "vaultSecretId"})
    public SandboxCredentialInjectionHeader(String name, String prefix, String vaultSecretId) {
        super();
        this.name = name;
        this.prefix = prefix;
        this.vaultSecretId = vaultSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The end-to-end HTTP request header to replace. Routing, connection-specific, forwarding,
         * proxy authentication, and HTTP pseudo-header names are prohibited.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The end-to-end HTTP request header to replace. Routing, connection-specific, forwarding,
         * proxy authentication, and HTTP pseudo-header names are prohibited.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Optional UTF-8 text prepended unchanged to the decoded Vault secret value. Omitted and
         * empty values both mean no prefix.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Optional UTF-8 text prepended unchanged to the decoded Vault secret value. Omitted and
         * empty values both mean no prefix.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The OCID of the OCI Vault secret read at the {@code CURRENT} stage for every selected
         * request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * The OCID of the OCI Vault secret read at the {@code CURRENT} stage for every selected
         * request.
         *
         * @param vaultSecretId the value to set
         * @return this builder
         */
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxCredentialInjectionHeader build() {
            SandboxCredentialInjectionHeader model =
                    new SandboxCredentialInjectionHeader(
                            this.name, this.prefix, this.vaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxCredentialInjectionHeader model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
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
     * The end-to-end HTTP request header to replace. Routing, connection-specific, forwarding,
     * proxy authentication, and HTTP pseudo-header names are prohibited.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The end-to-end HTTP request header to replace. Routing, connection-specific, forwarding,
     * proxy authentication, and HTTP pseudo-header names are prohibited.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Optional UTF-8 text prepended unchanged to the decoded Vault secret value. Omitted and empty
     * values both mean no prefix.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Optional UTF-8 text prepended unchanged to the decoded Vault secret value. Omitted and empty
     * values both mean no prefix.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * The OCID of the OCI Vault secret read at the {@code CURRENT} stage for every selected
     * request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * The OCID of the OCI Vault secret read at the {@code CURRENT} stage for every selected
     * request.
     *
     * @return the value
     */
    public String getVaultSecretId() {
        return vaultSecretId;
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
        sb.append("SandboxCredentialInjectionHeader(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCredentialInjectionHeader)) {
            return false;
        }

        SandboxCredentialInjectionHeader other = (SandboxCredentialInjectionHeader) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
