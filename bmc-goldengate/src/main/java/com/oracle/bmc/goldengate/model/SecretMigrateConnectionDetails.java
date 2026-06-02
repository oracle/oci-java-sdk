/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Definition of the additional attributes for secret Connection migrate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecretMigrateConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecretMigrateConnectionDetails extends MigrateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
        private String secretCompartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         * @param secretCompartmentId the value to set
         * @return this builder
         **/
        public Builder secretCompartmentId(String secretCompartmentId) {
            this.secretCompartmentId = secretCompartmentId;
            this.__explicitlySet__.add("secretCompartmentId");
            return this;
        }
        /**
         * Refers to the customer's vault OCID.
         * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
         * to manage secrets contained within this vault.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * Refers to the customer's vault OCID.
         * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
         * to manage secrets contained within this vault.
         *
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * Refers to the customer's master key OCID.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * Refers to the customer's master key OCID.
         * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
         *
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretMigrateConnectionDetails build() {
            SecretMigrateConnectionDetails model =
                    new SecretMigrateConnectionDetails(
                            this.secretCompartmentId, this.vaultId, this.keyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretMigrateConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("secretCompartmentId")) {
                this.secretCompartmentId(model.getSecretCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
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
    public SecretMigrateConnectionDetails(
            String secretCompartmentId, String vaultId, String keyId) {
        super();
        this.secretCompartmentId = secretCompartmentId;
        this.vaultId = vaultId;
        this.keyId = keyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretCompartmentId")
    private final String secretCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     * @return the value
     **/
    public String getSecretCompartmentId() {
        return secretCompartmentId;
    }

    /**
     * Refers to the customer's vault OCID.
     * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
     * to manage secrets contained within this vault.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * Refers to the customer's vault OCID.
     * If provided, it references a vault where GoldenGate can manage secrets. Customers must add policies to permit GoldenGate
     * to manage secrets contained within this vault.
     *
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Refers to the customer's master key OCID.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * Refers to the customer's master key OCID.
     * If provided, it references a key to manage secrets. Customers must add policies to permit GoldenGate to use this key.
     *
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
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
        sb.append("SecretMigrateConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretCompartmentId=").append(String.valueOf(this.secretCompartmentId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretMigrateConnectionDetails)) {
            return false;
        }

        SecretMigrateConnectionDetails other = (SecretMigrateConnectionDetails) o;
        return java.util.Objects.equals(this.secretCompartmentId, other.secretCompartmentId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.secretCompartmentId == null
                                ? 43
                                : this.secretCompartmentId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        return result;
    }
}
